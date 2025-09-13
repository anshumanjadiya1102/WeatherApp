import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Create WebView to display HTML GUI
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        engine.load(getClass().getResource("/weather.html").toExternalForm());

        // Java-JS bridge: allow HTML JS to call Java methods
        JSObject window = (JSObject) engine.executeScript("window");
        window.setMember("javaConnector", new JavaConnector(engine));

        // Setup scene and stage
        Scene scene = new Scene(webView, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Weather App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    // Connector class to handle JS calls
    public static class JavaConnector {
        private WebEngine engine;

        public JavaConnector(WebEngine engine) {
            this.engine = engine;
        }

        // Called by HTML JS
        public void getWeather(String city) {
            String result = WeatherFetcher.getWeather(city); // Fetch from static JSON
            // Update the HTML GUI with weather info
            engine.executeScript("updateWeather('" + result.replace("'", "\\'") + "')");
        }
    }
}
