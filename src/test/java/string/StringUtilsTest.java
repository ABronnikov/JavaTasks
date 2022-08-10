package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void test0_getTheBiggestStringFromArray_ShouldReturnCorrectResult() {
        String[] strings = {
                "Нередко встречаются методы",
                "Нет причин рассматривать как особый случай ситуацию",
                "Это требует от клиента написания дополнительного кода для обработки возвращаемого методом значения",
                "Такого рода многоречивость необходима",
                "Иногда можно услышать возражения, что возврат значения null предпочтительнее"
        };
        BigString result = StringUtils.getTheBiggestStringFromArray(strings);
        BigString expected = new BigString(98, "Это требует от клиента написания дополнительного кода для обработки возвращаемого методом значения".toUpperCase());
        Assertions.assertEquals(expected, result);
    }

    @Test
    void test1_getTheBiggestStringFromArray_ShouldReturnNull() {
        String[] strings = {};
        BigString result = StringUtils.getTheBiggestStringFromArray(strings);
        Assertions.assertEquals(null, result);
    }
}