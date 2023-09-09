package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Data3 {

    private int[] argsNum2 = new int[0];
    private int[] argsNum = new int[0];

    public int[] getArgsNum() {
        return argsNum2;
    }

    public int[] getArgsNum2() {
        return argsNum2;
    }

    public void inputAndSave() {
        Scanner scanner = new Scanner(System.in);
        String line = null;

        while ((line = scanner.nextLine()) != null && !line.isEmpty()) {
            Scanner lineScanner = new Scanner(line);
            try {
                int inputNum = lineScanner.nextInt();
                int length = argsNum2.length + 1;
                int[] tmp = new int[length];
                System.arraycopy(argsNum2, 0, tmp, 0, argsNum2.length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = inputNum;
                argsNum2 = tmp;
            } catch (Exception e) {
                System.out.println("Вводите только цифры");
            }
        }
    }

    public int[] arrayHandler(int[] input) {
        int i = 0;
        while (i < input.length) {
            if (input[i] % 3 == 0) {
                int length = argsNum.length + 1;
                int[] tmp = new int[length];
                System.arraycopy(argsNum, 0, tmp, 0, argsNum.length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = input[i];
                argsNum = tmp;
            }
            i++;
        }
        return argsNum;
    }

    public void printNum(int[] argsNum) {
        System.out.println(Arrays.toString(argsNum));
    }

    public static void main(String[] args) {
        Data3 data3 = new Data3();
        data3.inputAndSave();
        data3.printNum(data3.arrayHandler(data3.argsNum2));
    }
}
