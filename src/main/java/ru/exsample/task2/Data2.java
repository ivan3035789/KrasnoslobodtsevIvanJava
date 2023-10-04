package ru.exsample.task2;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Класс данных со свойствами <b>num</b>.
 * @author Ivan
 * @version 1.0
 */
public class Data2 {
    /** Поле номер. */
    private int num;

    /**
     * Функция получения значения поля {@link Data2#num}.
     * @return возвращает число
     */
    public int getNum() {
        return num;
    }

    /**
     * Процедура установки числа {@link Data2#num}.
     * @param numSet - производитель
     */
    public void setNum(final int numSet) {
        this.num = numSet;
    }

    /**
     * Функция обработки введенного значения {@link Data2#num}.
     * @param numSet - число
     * @return возвращает "Привет" если число больше 7
     */
    public String choiceNum(final int numSet) {
        final int numSeven = 7;
        return numSet > numSeven ? "Привет" : "";
    }

    /**
     * Функция ввода числа {@link Data2#num}.
     * @return возвращает число введенное из консоли
     */
    public int inputDate() {
        final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Введите число: \n");
            try {
                num = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Вводите только цифры!!! \n");
            }

        return num;
    }

    /**
     * Функция вывода приветствия {@link Data2#num}.
     * @param greeting - число
     */
    public void printGreeting(final String greeting) {
        System.out.println(greeting);
    }

    /**
     * Функция запуска программы.
     * @param args - массив строк
     */
    public static void main(final String[] args) {
        final Data2 data2 = new Data2();
        data2.inputDate();
        data2.printGreeting(data2.choiceNum(data2.getNum()));
    }
}
