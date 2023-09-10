package task2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Data2 {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String choiceNum(@NotNull int num) {
        return num > 7 ? "Привет" : "";
    }

    public void inputDate() {
        Scanner scanner = new Scanner(System.in);
        String line = null;

        while ((line = scanner.nextLine()) != null && !line.isEmpty()) {
            Scanner lineScanner = new Scanner(line);
            try {
                num = lineScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Вводите только цифры!!!");
            }
        }
    }

    public String printGreeting(String greeting) {
        System.out.println(greeting);
        return greeting;
    }

    public static void main(String []args) {
        Data2 data2 = new Data2();
        data2.inputDate();
        data2.printGreeting(data2.choiceNum(data2.getNum()));
    }
}
