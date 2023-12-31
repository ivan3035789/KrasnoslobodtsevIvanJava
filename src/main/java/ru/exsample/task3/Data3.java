package ru.exsample.task3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс данных со свойством <b>argsNum2</b>.
 *
 * @author Ivan
 * @version 1.0
 */
public class Data3 {

    /**
     * Массив с введенными числами.
     */
    private double[] argsNum2 = new double[0];

    /**
     * Функция ввода чисел в консоле {@link Data3#argsNum2}.
     */
    public void inputAndSave() {
        final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Введите число и нажимайте ENTER:\n");
        System.out.println("Для завершения нажимайте ENTER:\n");
        String line;

        while ((line = scanner.nextLine()) != null && !line.isEmpty()) {
            final Scanner lineScanner = new Scanner(line);
            try {
                final double inputNum = lineScanner.nextDouble();
                System.out.println("Введите число и нажимайте ENTER:\n");
                System.out.println("Для завершения нажимайте ENTER:\n");
                final int length = argsNum2.length + 1;
                final double[] tmp = new double[length];
                System.arraycopy(argsNum2, 0, tmp, 0, argsNum2.length);
                final int lastIndex = tmp.length - 1;
                tmp[lastIndex] = inputNum;
                argsNum2 = tmp;
            } catch (RuntimeException e) {
                if (line.contains(".")) {
                    System.out.println("используйте \",\" для дробного числа");
                } else {
                    System.out.println("Вводите только цифры");
                }
            }
        }
    }


    /**
     * Функция перебора массива с числами {@link Data3#argsNum2}.
     *
     * @param input - массив с числами
     * @return возвращает массив с числами кратными 3
     */
    public double[] arrayHandler(final double[] input) {
        double[] argsNum = new double[0];
        int i = 0;
        final double multipleNumber = 3;
        while (i < input.length) {
            if (input[i] % multipleNumber == 0) {
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
     * Функция вывода приветствия.
     *
     * @param argsNumMultipleNumber - массив с числами кратными 3
     */
    public void printNum(final double[] argsNumMultipleNumber) {
        System.out.println(Arrays.toString(argsNumMultipleNumber));
    }

    /**
     * Функция запуска программы.
     *
     * @param args - массив строк
     */
    public static void main(final String[] args) {
        final Data3 data3 = new Data3();
        data3.inputAndSave();
        data3.printNum(data3.arrayHandler(data3.argsNum2));
    }
}
