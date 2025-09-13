<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&text=Weather+App&height=100&section=header"/>

# 🌤️ Java Weather App (Offline, No API Key Required)

[![Java Version](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)](https://www.oracle.com/java/) 
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE) 
[![GitHub Repo Size](https://img.shields.io/github/repo-size/anshumanjadiya1102/WeatherApp)](https://github.com/anshumanjadiya1102/WeatherApp) 
[![Stars](https://img.shields.io/github/stars/anshumanjadiya1102/WeatherApp?style=social)](https://github.com/anshumanjadiya1102/WeatherApp/stargazers) 

---

## Overview
This is a **simple Java Weather App** using **JavaFX** and an **HTML GUI**.  
It shows weather for predefined cities using a **static JSON file**.
No API key or internet connection is required, making it **ready-to-run** for anyone.


---

## Features
- HTML-based GUI inside a JavaFX window.  
- Enter a city name to view its weather.  
- Works completely **offline**.  
- Easy to run, modify, and extend.  
- Learn JavaFX, JSON handling, and HTML integration.  

---

## Supported Cities
- London  
- New York  
- Tokyo  
- Paris  
- Sydney  
- Mumbai  
- Cairo  
- Moscow  

> Add more cities in `resources/weatherdata.json` by:
```
{
  "London": { "temp": 18, "description": "Cloudy" },
  "New York": { "temp": 25, "description": "Sunny" },
  "Tokyo": { "temp": 20, "description": "Rainy" },
  "Paris": { "temp": 22, "description": "Sunny" },
  "Sydney": { "temp": 15, "description": "Windy" },
  "Mumbai": { "temp": 30, "description": "Humid" },
  "Cairo": { "temp": 28, "description": "Sunny" },
  "Moscow": { "temp": 10, "description": "Snowy" }
  \\ Add more cities here in the same way
}
```


---

## Project Structure
WeatherApp/<br>
│<br>
├── src/<br>
│    ├── Main.java<br>
│    ├── WeatherFetcher.java<br>
│<br>
├── resources/<br>
│     ├── weather.html<br>
│     └── weatherdata.json<br>
│<br>
└── README.md<br>


---

## How to Run

### Copy the Code
```
git clone https://github.com/anshumanjadiya1102/WeatherApp.git
```

### 1. Compile

```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.web src/*.java
```

### Run
```bash
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.web Main
```
> [!NOTE]
> The `--module-path` tells Java where to find the JavaFX libraries.<br>
> JavaFX is not bundled with Java (11+), so you must download it separately from [here](https://gluonhq.com/products/javafx)
>
> Extract the SDK to a folder, for example:<br>
> Windows: `C:\javafx-sdk-21\lib`<br>
> Linux/macOS: `/home/user/javafx-sdk-21/lib`><br>
>
> Always point the module path to the lib/ folder inside the extracted `JavaFX SDK`.


## Output of hardwork
```
+-------------------------------------+
|           Weather App                |
|-------------------------------------|
| Enter city: [London      ] [Get]    |
|                                     |
| Temperature: 18°C, Cloudy           |
+-------------------------------------+

```

