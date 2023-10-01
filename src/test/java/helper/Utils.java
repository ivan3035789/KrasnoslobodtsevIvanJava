package helper;

import java.util.Random;

public class Utils {

    private Utils() {
    }

    public static String randomInvalidName() {
        Random random = new Random();
        String[] invalidName =
                {
                "Ivan",
                "вячеслав",
                "Vyacheslav",
                "Вячеслав Вячеслав",
                "ВячеславВячеслав",
                "ВячеслаB",
                "",
                " "
                };
        return invalidName[random.nextInt(invalidName.length)];
    }

    public static int randomInvalidNum() {
        Random random = new Random();
        int[] invalidNum = {
                -1,
                0,
                6,
                7
        };
        return invalidNum[random.nextInt(invalidNum.length)];
    }

    public static int randomValidNum() {
        Random random = new Random();
        int[] invalidNum =
                {
                        8,
                        +10
                };
        return invalidNum[random.nextInt(invalidNum.length)];
    }
}
