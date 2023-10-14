package com.example.task;

import com.example.task1.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Класс запуска интерфейса.
 * @author Ivan
 * @version 1.0
 */
public class HelloApplication2 extends Application {

    /**
     * Функция ввода числа {@link HelloApplication2}.
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com.example/task1/hello2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Функция запуска программы.
     * @param args - массив строк
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
