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

    public void printGreeting(String greeting) {
        System.out.println(greeting);
    }

    public static void main(String []args) {
        Data2 data2 = new Data2();
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        data2.printGreeting(data2.choiceNum(num));
    }
}
