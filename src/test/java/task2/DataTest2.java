package task2;

import helper.Utils;
import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import ru.exsample.task2.Data2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest2 {
    Data2 data2 = new Data2();
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
    @Description("В этом тест-кейсе мы проверяем что при вводе цифры больше 7 выводится сообщение 'Привет'")
    @DisplayName("I Have To Bring Out Hello Vyacheslav")
    @Test
    public void shouldOutputTheMessageHello() {
        data2.setNum(Utils.randomValidNum());
        String expected = "Привет";
        String actual = data2.choiceNum(data2.getNum());
        assertEquals(expected, actual);
    }

    @Order(2)
    @Description("В этом тест-кейсе мы проверяем что при вводе цифры больше 7 выводится Привет")
    @DisplayName("Must bring out the following")
    @Test
    public void mustBringOutTheFollowing() {
        data2.setNum(8);
        data2.printGreeting(data2.choiceNum(data2.getNum()));
        assertEquals("Привет", outContent.toString().trim());
    }

    @Order(3)
    @Description("В этом тест-кейсе мы проверяем что при вводе цифры меньше 7 выводится пустое сообщение")
    @DisplayName("Should output an empty string")
    @Test
    public void shouldOutputAnEmptyString() {
        data2.setNum(Utils.randomInvalidNum());
        data2.printGreeting(data2.choiceNum(data2.getNum()));
        assertEquals("", outContent.toString().trim());
    }
}
