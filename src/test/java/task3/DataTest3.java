package task3;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import ru.exsample.task3.Data3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest3 {
    Data3 data3 = new Data3();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Order(1)
    @Description("В этом тест-кейсе мы проверяем что выводятся элементы массива кратные 3")
    @DisplayName("must output array elements that are multiples of three")
    @Test
    public void mustOutputArrayElementsThatAreMultiplesOfThree() {
        double[] args = {1, 3, 6, 9, 30};

        double[] actual = data3.arrayHandler(args);
        double[] expected = new double[]{3, 6, 9, 30};
        assertArrayEquals(expected, actual);
    }

    @Order(2)
    @Description("В этом тест-кейсе мы проверяем что программа завершается при отсутствии данных ввода")
    @DisplayName("must output array elements that are multiples of three")
    @Test
    public void theProgramShouldTerminateInTheAbsenceOfInputData() {
        double[] args = {};
        double[] actual = data3.arrayHandler(args);
        double[] expected = new double[]{};
        assertArrayEquals(expected, actual);
    }

    @Order(3)
    @Description("В этом тест-кейсе мы проверяем что выводится содержимое массива")
    @DisplayName("must output the contents of the array")
    @Test
    public void mustOutputTheContentsOfTheArray() {
        double[] args = {1, 3, 6, 9, 30};

        double[] actual = data3.arrayHandler(args);
        double[] expected = new double[]{3, 6, 9, 30};
        assertArrayEquals(expected, actual);
        data3.printNum(actual);
        assertEquals("[3.0, 6.0, 9.0, 30.0]", outContent.toString().trim());

    }
}
//TODO исправить spotbugsTest