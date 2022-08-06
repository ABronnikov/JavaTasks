package branchoperators.movie;

/**
 * Сервис доступа в кинотеатр.
 */
public class MovieAccessService {

    /**
     * Данный метод вовзращает строку уведомляющую о правах доступа в кинотеатр.
     * @param age возраст посетителя
     * @return строка с правами доступа.
     * 1. К классу MovieAccessService написать unit тесты с использованием библиотеки junit.
     * 2. Добавить логику для проверки, что возраст невалидный (невалидный возраст это возраст который меньше или равен нулю)
     * Данная проверка должна возвращать строку "Некорректный возраст, проверьте пользователя с данным возрастом"
     * (естественно на английском языке :) )). Написать на этот случай unit тест.
     * Подсказка. Assert.assertEquals может работать не только с числами, но и сверять строки.
     */
    public static String accessMovie(int age) {
        if (age >= 18 && age <= 21) {
            return "Rating R. Access is allowed.";
        } else if (age > 21) {
            return "Rating F. Access is allowed.";
        } else if (age <= 0) {
            return "Incorrect age, check the user with this age.";
        } else {
            return "Access is denied.";
        }
    }
}
