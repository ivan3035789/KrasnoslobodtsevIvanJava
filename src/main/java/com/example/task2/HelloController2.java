package com.example.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Класс ввода, обработки и вывода данных со свойствами <b>welcomeText</b>.
 * @author Ivan
 * @version 1.0
 */
public class HelloController2 {

    /** Поле с выводом сообщения об ошибке ввода fx:id="error". */
    @FXML
    private Label error;

    /** Кнопка cancel". */
    @FXML
    public Button cancel;

    /** Поле ввода fx:id="inputField". */
    @FXML
    private TextField inputField;

    /** Кнопка ok fx:id="mainBtn". */
    @FXML
    private Button mainBtn;

    /** Поле с выводом приведствия fx:id="mainLabel"". */
    @FXML
    private Label mainLabel;

    /**
     * Функция обработки введенного значения {@link HelloController2#inputField}.
     * @param numSet - цифра
     * @return возвращает приведствие
     */
    @FXML
    public String choiceNum(final String numSet) {
        final int numSeven = 7;
        return Integer.parseInt(numSet) > numSeven ? "Привет" : "";
    }

    /**
     * Функция ввода и обработки введенного значения {@link HelloController2#inputField}.
     * @param event - клик на кнопку ок
     */
    @FXML
    void btnClick(ActionEvent event) {
        try {
            if (error.isVisible()) {
                error.setText("");
                mainLabel.setText("");
            }
            mainLabel.setText(choiceNum(inputField.getText().trim()));
        } catch (Exception e) {
            if (inputField.getText().trim().isEmpty()) {
                error.setText("Поле не должно быть пустым");

            } else {
                inputField.getText();
                error.setText("Вводите только цифры!");
            }
        }
    }

    /**
     * Функция кнопки cancel.
     * @param event - клик на кнопку cancel
     */
    @FXML
    void remove(ActionEvent event) {
        if (error.isVisible()) {
            inputField.setText("");
            mainLabel.setText("");
            error.setText("");
        }
    }

    /**
     * Функция вызывается FXMLLoader после завершения инициализации
     */
    @FXML
    void initialize() {

    }
}

