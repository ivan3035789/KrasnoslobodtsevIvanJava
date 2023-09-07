package task1;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Data {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String choiceName(@NotNull String name) {
        String[] strName = {"Привет, " + name, "Нет такого имени"};
        String choice;
        if (name.equals("Вячеслав")) {
            choice = strName[0];
        } else {
            choice = strName[1];
        }
        return choice;
    }

    public void printName(String name) {
        System.out.println(name);
    }

    public static void main(String []args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        data.setName(name);
        data.printName(data.choiceName(name));
    }
}
