package com.example.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Класс обработки и вывода данных со свойствами <b>welcomeText</b>.
 * @author Ivan
 * @version 1.0
 */
public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    /** Кнопка cancel". */
    @FXML
    private Button cancelBtn;

    /** Поле с выводом сообщения об ошибке ввода fx:id="errorLabel". */
    @FXML
    private Label errorLabel;

    /** Поле ввода fx:id="inputField". */
    @FXML
    private TextField inputField;

    /** Поле с выводом приведствия fx:id="mainLabel"". */
    @FXML
    private Label mainLabel;

    /** Кнопка ok fx:id="okBtn". */
    @FXML
    private Button okBtn;

    /**
     * Функция обработки введенного значения {@link HelloController}.
     * @param text - имя
     * @return возвращает приведствие
     */
    @FXML
    public String choiceName(String text) {
        return text.trim().equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
    }

    /**
     * Функция ввода и обработки введенного значения {@link HelloController#inputField}.
     * @param event - нажатие на кнопку ок
     */
    @FXML
    void btnClick(ActionEvent event) {
        if (errorLabel.isVisible()) {
            errorLabel.setText("");
            mainLabel.setText("");
        }
        mainLabel.setText(choiceName(inputField.getText()));
        if (inputField.getText().trim().isEmpty()) {
            mainLabel.setText("");
            errorLabel.setText("Поле не должно быть пустым");
        }
    }

    /**
     * Функция кнопки cancel.
     * @param event - нажатие на кнопку cancel
     */
    @FXML
    void remove(ActionEvent event) {
        if (errorLabel.isVisible()) {
            inputField.setText("");
            mainLabel.setText("");
            errorLabel.setText("");
        }
    }

    /**
     * Функция вызывается FXMLLoader после завершения инициализации
     */
    @FXML
    void initialize() {

    }
}
