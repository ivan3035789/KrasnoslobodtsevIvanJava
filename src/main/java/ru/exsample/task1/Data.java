package ru.exsample.task1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Класс данных со свойствами <b>name</b>.
 * @author Ivan
 * @version 1.0
 */
public class Data {
    /** Поле имя. */
    private String name;

    /**
     * Процедура установки имени {@link Data#name}.
     * @param nameSet - производитель
     */
    public void setName(final String nameSet) {
        this.name = nameSet;
    }

    /**
     * Функция получения значения поля {@link Data#name}.
     * @return возвращает имя
     */
    public String getName() {
        return name;
    }

    /**
     * Функция обработки введенного значения {@link Data#name}.
     * @param nameSet - имя
     * @return возвращает "Привет, Вячеслав" или "Нет такого имени"
     */
    public String choiceName(final String nameSet) {
        final String[] strName = {"Привет, " + nameSet, "Нет такого имени"};
        return nameSet.equals("Вячеслав") ? strName[0] : strName[1];
    }

    /**
     * Функция вывода приветствия {@link Data#name}.
     * @param nameSet - имя
     */
    public void printName(final String nameSet) {
        System.out.println(nameSet);
    }

    /**
     * Функция ввода имени {@link Data#name}.
     * @return возвращает имя введенное из консоли
     */
    public String inputData() {
        System.out.println("Введите имя\n");
        final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
            name = scanner.nextLine();
        return name;
    }

    /**
     * Функция запуска программы.
     * @param args - массив строк
     */
    public static void main(final String[] args) {
        final Data data = new Data();
        data.setName(data.inputData());
        data.printName(data.choiceName(data.getName()));
    }
}
