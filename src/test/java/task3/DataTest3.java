package task3;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DataTest3 {
    Data3 data3 = new Data3();

    @Order(1)
    @Description("В этом тест-кейсе мы проверяем что выводятся элементы массива кратные 3")
    @DisplayName("must output array elements that are multiples of three")
    @Test
    public void mustOutputArrayElementsThatAreMultiplesOfThree() {
        int[] args = {1, 3, 6, 9, 30};

        int[] actual = data3.arrayHandler(args);
        int[] expected = new int[]{3, 6, 9, 30};
        assertArrayEquals(expected, actual);
    }

    @Order(1)
    @Description("В этом тест-кейсе мы проверяем что программа завершается при отсутствии данных ввода")
    @DisplayName("must output array elements that are multiples of three")
    @Test
    public void theProgramShouldTerminateInTheAbsenceOfInputData() {
        int[] args = {};

        int[] actual = data3.arrayHandler(args);
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }
}
