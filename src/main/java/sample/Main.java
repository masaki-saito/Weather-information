package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.model.WeatherForecast;
import sample.service.WeatherService;
import sample.service.WeatherServiceJson;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        final TextField cityInput = new TextField();
        final TextArea weatherForecast = new TextArea();
        Button button = new Button("OK");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // Type key from OpenWeatherMap as second argument String privateKey below
                WeatherService service = new WeatherServiceJson("http://api.apixu.com/v1/current.json", "privateKey");
                WeatherForecast forecast = service.getWeatherByCity(cityInput.getText());
                weatherForecast.setText(forecast.toString());
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(cityInput, button, weatherForecast);


        primaryStage.setTitle("Weather");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
