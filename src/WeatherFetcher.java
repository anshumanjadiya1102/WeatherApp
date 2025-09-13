import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

public class WeatherFetcher {

    public static String getWeather(String city) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("resources/weatherdata.json")));
            JSONObject obj = new JSONObject(content);

            if (!obj.has(city)) return "City not found!";

            JSONObject weather = obj.getJSONObject(city);
            int temp = weather.getInt("temp");
            String desc = weather.getString("description");

            return "Temperature: " + temp + "°C, " + desc;

        } catch (Exception e) {
            return "Error reading weather data: " + e.getMessage();
        }
    }
}
