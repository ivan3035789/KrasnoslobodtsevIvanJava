package task2;

import helper.Utils;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class dataTest2 {
    Data2 data2 = new Data2();

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
    @Description("В этом тест-кейсе мы проверяем что при вводе цифры меньше 7 ничего не выводится")
    @DisplayName("I Have To Bring Out Hello Vyacheslav")
    @Test
    public void shouldNotOutputAnything() {
        data2.setNum(Utils.randomInvalidNum());
        String expected = "";
        String actual = data2.choiceNum(data2.getNum());
        assertEquals(expected, actual);
    }

}
