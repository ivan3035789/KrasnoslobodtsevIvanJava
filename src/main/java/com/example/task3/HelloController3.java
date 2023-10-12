package com.example.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс ввода, обработки и вывода данных со свойствами <b>welcomeText</b>.
 * @author Ivan
 * @version 1.0
 */
public class HelloController3 {

    /**
     * Массив с введенными числами.
     */
    private double[] argsNum2 = new double[0];

    /** Поле для ввода делиметра. */
    @FXML
    public TextField inputFieldDelimetr;

    /** Кнопка вывода чисел кратных числу fx:id="enterBtn". */
    @FXML
    public Button enterBtn;

    /** Кнопка вывода всего списка чисел fx:id="enterAll". */
    @FXML
    private Button enterAll;

    /** Кнопка удаления всего списка fx:id="cancelBtn". */
    @FXML
    public Button cancelBtn;

    /** Поле для ввода цифр  fx:id="inputField". */
    @FXML
    public TextField inputField;

    /** Кнопка добавления числа в список fx:id="addBtn". */
    @FXML
    private Button addBtn;

    /** Поле вывода предупреждающих сообщений  fx:id="errorLabel". */
    @FXML
    private Label errorLabel;

    /** Поле вывода предупреждающих сообщений  fx:id="errorLabelDelimetr". */
    @FXML
    private Label errorLabelDelimetr;

    /** Поле вывода введенных данных  fx:id="mainLabel". */
    @FXML
    private Label mainLabel;

    /** Кнопка удаления числа из список fx:id="removeBtn". */
    @FXML
    private Button removeBtn;

    /**
     * Функция ввода чисел и добавления в массив {@link HelloController3#argsNum2}.
     * @param trim - введенное число
     * @return возвращает массив с числами
     */
    public double[] inputAndSave(String trim) {
        final Scanner lineScanner = new Scanner(inputField.getText());
        final double inputNum = lineScanner.nextDouble();
        final int length = argsNum2.length + 1;
        final double[] tmp = new double[length];
        System.arraycopy(argsNum2, 0, tmp, 0, argsNum2.length);
        final int lastIndex = tmp.length - 1;
        tmp[lastIndex] = inputNum;
        argsNum2 = tmp;
        return argsNum2;
    }

    /**
     * Функция перебора массива с числами {@link HelloController3#argsNum2}.
     * @param input - массив с числами
     * @param num - делитель
     * @return возвращает массив с числами кратными делителю
     */
    public double[] arrayHandler(final double[] input, String num) {
        double[] argsNum = new double[0];
        int i = 0;
        while (i < input.length) {
            if (input[i] % Double.parseDouble(num) == 0) {
                final int length = argsNum.length + 1;
                final double[] tmp = new double[length];
                System.arraycopy(argsNum, 0, tmp, 0, argsNum.length);
                final int lastIndex = tmp.length - 1;
                tmp[lastIndex] = input[i];
                argsNum = tmp;
            }
            i++;
        }
        return argsNum;
    }

    /**
     * Функция удаления числа из массива {@link HelloController3#argsNum2}.
     * @param input - массив с числами
     * @param num - удаляемое число
     * @return возвращает массив с числами кратными делителю
     */
    public double[] arrayHandlerRemove(final double[] input, double num) {
        int length = input.length - 1;
        double[] tmp = new double[length];
        int index = 0;
        for (Double arg : input) {
            if (arg != num) {
                tmp[index] = arg;
                index++;
            }
        }
        return argsNum2 = tmp;
    }

    /**
     * Функция вывода массива с числами {@link HelloController3#argsNum2}.
     * @return возвращает массив со всеми числами
     */
    public double[] findAll(double[] argsNum2) {
        return this.argsNum2;
    }

    /**
     * Функция проверки введенного значения.
     * @param str - проверяемая строка
     * @return возвращает массив со всеми числами
     */
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    /**
     * Функция добавления введенного числа {@link HelloController3#argsNum2}.
     * @param event - нажатие на кнопку добавления
     */
    @FXML
    void addClick(ActionEvent event) {
        try {
            if (errorLabel.isVisible()) {
                errorLabel.setText("");
                mainLabel.setText("");
            }
            mainLabel.setText(Arrays.toString(inputAndSave(inputField.getText().trim())));
            inputField.setText("");
        } catch (Exception e) {
            if (inputField.getText().trim().isEmpty()) {
                errorLabel.setText("Поле не должно быть пустым");
            } else {
                inputField.getText();
                errorLabel.setText("Вводите только цифры!");
            }
        }
    }

    /**
     * Функция удаления списка с числами {@link HelloController3#argsNum2}.
     * @param event - нажатие на кнопку удаления
     */
    @FXML
    void cancelClick(ActionEvent event) {
        mainLabel.setText("");
        inputField.setText("");
        errorLabel.setText("");
        errorLabelDelimetr.setText("");
        argsNum2 = new double[0];
        mainLabel.setText("Список пуст!");
    }

    /**
     * Функция вывода списка с числами кратными делиметру {@link HelloController3#argsNum2}.
     * @param event - нажатие на кнопку вывода
     */
    @FXML
    void enterClick(ActionEvent event) {
        if (errorLabelDelimetr.isVisible()) {
            errorLabelDelimetr.setText("");
        }
        try {
            mainLabel.setText(Arrays.toString(arrayHandler(argsNum2, inputFieldDelimetr.getText())));
        } catch (Exception e) {
            if (inputFieldDelimetr.getText().trim().isEmpty()) {
                errorLabelDelimetr.setText("Поле не должно быть пустым");
            } else {
                inputFieldDelimetr.getText();
                errorLabelDelimetr.setText("Вводите только цифры!");
            }
        }
        if (argsNum2 == null || argsNum2.length == 0) {
            mainLabel.setText("Список пуст!");
            errorLabelDelimetr.setText("Добавьте делитель");
            errorLabel.setText("Введите число и добавте в список");
        }
    }

    /**
     * Функция удаления числа из списка {@link HelloController3#argsNum2}.
     * @param event - нажатие на кнопку добавления
     */
    @FXML
    void removeClick(ActionEvent event) {
        if (errorLabel.isVisible()) {
            errorLabel.setText("");
            errorLabelDelimetr.setText("");
        }
        try {
            mainLabel.setText(Arrays.toString(arrayHandlerRemove(argsNum2, Double.parseDouble(inputField.getText()))));
        } catch (Exception e) {
            if (inputField.getText().trim().isEmpty()) {
                errorLabel.setText("Введите число для удаления ");
            }
            else if (argsNum2 == null || argsNum2.length == 0) {
                mainLabel.setText("Список пуст!");
                errorLabel.setText("Список пуст!");
            }
            else if (argsNum2.length != 0 && isNumeric(inputField.getText())) {
                errorLabel.setText("В списке отсутствует число " + inputField.getText());
            } else {
                errorLabel.setText("Вводите только цифры!");
            }
        }
    }

    /**
     * Функция вывода полного списка чмсел {@link HelloController3#argsNum2}.
     */
    @FXML
    void findAll() {
        if (errorLabelDelimetr.isVisible()) {
            errorLabelDelimetr.setText("");
        }
        if (argsNum2 == null || argsNum2.length == 0) {
            mainLabel.setText("Список пуст!");
            errorLabel.setText("Введите число и добавте в список");
        } else {
            mainLabel.setText(Arrays.toString(findAll(argsNum2)));
        }
    }

    /**
     * Функция вызывается FXMLLoader после завершения инициализации
     */
    @FXML
    void initialize() {

    }

}
