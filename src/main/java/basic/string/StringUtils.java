package basic.string;

public class StringUtils {

    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении
     *
     * @param strings массив строк
     * @return самая большая строка в верхнем регистре
     */

    public static BigString getTheBiggestStringFromArray(String[] strings) {
        if (strings != null) {
            if (strings.length != 0) {
                String stringMaxLength = "";
                int maxLengthString = 0;
                for (String string :
                    strings) {
                    if (string.length() > maxLengthString) {
                        stringMaxLength = string;
                        maxLengthString = string.length();
                    }
                }
                return new BigString(maxLengthString, stringMaxLength.toUpperCase());
            } else {
                return null;
            }
        } else {
            return null;
        }

    }
}
