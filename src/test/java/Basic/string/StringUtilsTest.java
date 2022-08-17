package Basic.string;

import Basic.string.BigString;
import Basic.string.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void shouldReturnCorrectResult() {
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
    void shouldReturnNull() {
        String[] strings = {};
        BigString result = StringUtils.getTheBiggestStringFromArray(strings);
        Assertions.assertNull(result);
    }
}