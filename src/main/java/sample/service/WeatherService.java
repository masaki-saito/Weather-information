package sample.service;

import sample.model.WeatherForecast;

public interface WeatherService {
    WeatherForecast getWeatherByCity(String city);
}
