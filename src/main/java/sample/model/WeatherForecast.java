package sample.model;

public class WeatherForecast {
    private String city;
    private String iconUrl;
    private double temperatureInCelsius;
    private double feelLikeTemperatureInCelsius;

    public WeatherForecast() {

    }

    public WeatherForecast(String city, String iconUrl, double temperatureInCelsius, double feelLikeTemperatureInCelsius) {
        this.city = city;
        this.iconUrl = iconUrl;
        this.temperatureInCelsius = temperatureInCelsius;
        this.feelLikeTemperatureInCelsius = feelLikeTemperatureInCelsius;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public double getFeelLikeTemperatureInCelsius() {
        return feelLikeTemperatureInCelsius;
    }

    public void setFeelLikeTemperatureInCelsius(double feelLikeTemperatureInCelsius) {
        this.feelLikeTemperatureInCelsius = feelLikeTemperatureInCelsius;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "city='" + city + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", temperatureInCelsius=" + temperatureInCelsius +
                ", feelLikeTemperatureInCelsius=" + feelLikeTemperatureInCelsius +
                '}';
    }
}
