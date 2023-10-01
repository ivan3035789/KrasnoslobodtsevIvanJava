package task1;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import ru.exsample.task1.Data;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static helper.Utils.randomInvalidName;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DataTest {
    Data data = new Data();
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
    @Description("В этом тест-кейсе мы проверяем что при вводе имени Вячеслав выводиться приведствие 'Привет, Вячеслав'")
    @DisplayName("I Have To Bring Out Hello Vyacheslav")
    @Test
    public void IHaveToBringOutHelloVyacheslav() {
        data.setName("Вячеслав");
        String expected = "Привет, Вячеслав";
        String actual = data.choiceName(data.getName());
        assertEquals(expected, actual);
        data.printName(data.choiceName(data.getName()));
        assertEquals(expected, outContent.toString().trim());
    }

    @Order(2)
    @Description("В этом тест-кейсе мы проверяем что при вводе, не имени 'Вячеслав', выводиться надпись 'Нет такого имени'")
    @DisplayName("must buy tour of Approved")
    @RepeatedTest(4)
    public void ShouldOutputHelloVyacheslav() {
        data.setName(randomInvalidName());
        String expected = "Нет такого имени";
        String actual = data.choiceName(data.getName());
        assertEquals(expected, actual);
        data.printName(data.choiceName(data.getName()));
        assertEquals("Нет такого имени", outContent.toString().trim());
    }
}
