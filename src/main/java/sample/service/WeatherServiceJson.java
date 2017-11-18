package sample.service;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import sample.model.WeatherForecast;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherServiceJson implements WeatherService {

    private String finalUrl;

    public WeatherServiceJson(String url, String privateKey) {
        finalUrl = url + "?key=" + privateKey;
    }

    public WeatherForecast getWeatherByCity(String city) {

        String requestUrl = finalUrl + "&q=" + city;

        try{
            JSONObject json = new JSONObject(IOUtils.toString(new URL(requestUrl), Charset.forName("UTF-8")));

            WeatherForecast weatherForecast = new WeatherForecast();
            weatherForecast.setTemperatureInCelsius((Double)json.getJSONObject("current").get("temp_c"));
            weatherForecast.setFeelLikeTemperatureInCelsius((Double)json.getJSONObject("current").get("feelslike_c"));
            weatherForecast.setIconUrl(json.getJSONObject("current").getJSONObject("condition").get("icon").toString());
            weatherForecast.setCity(city);

            return weatherForecast;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
