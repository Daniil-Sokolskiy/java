package main.java.weatherApi;


import com.google.gson.Gson;
import weatherApi.weather.Weather;

public class Formatter {
    public Weather parse(String info) {
        Gson gson = new Gson();
        return gson.fromJson(info, Weather.class);
    }
}
