package com.example.task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

/**
 * Класс ввода данных со свойствами <b>result</b>.
 * @author Ivan
 * @version 1.0
 */
public class HelloApplication extends Application {

    /** Поле результат. */
    private static Optional<String> result;


    /**
     * Функция получения значения поля {@link HelloApplication#result}.
     * @return возвращает результат
     */
    public Optional<String> getResult() {
        return result;
    }

    /**
     * Функция ввода имени {@link HelloApplication#result}.
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
        HelloApplication.launch(args);
    }
}
