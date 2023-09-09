package task1;

import helper.Utils;
import jdk.jfr.Description;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DataTest {
    Data data = new Data();

    @Order(1)
    @Description("В этом тест-кейсе мы проверяем что при вводе имени Вячеслав выводиться приведствие 'Привет, Вячеслав'")
    @DisplayName("I Have To Bring Out Hello Vyacheslav")
    @Test
    public void IHaveToBringOutHelloVyacheslav() {
        data.setName("Вячеслав");
        String expected = "Привет, Вячеслав";
        String actual = data.choiceName(data.getName());
        assertEquals(expected, actual);
    }

    @Order(2)
    @Description("В этом тест-кейсе мы проверяем что при вводе, не имени 'Вячеслав', выводиться надпись 'Нет такого имени'")
    @DisplayName("must buy tour of Approved")
    @RepeatedTest(4)
    public void ShouldOutputHelloVyacheslav() {
        data.setName(Utils.randomInvalidName());
        String expected = "Нет такого имени";
        String actual = data.choiceName(data.getName());
        assertEquals(expected, actual);
    }
}
