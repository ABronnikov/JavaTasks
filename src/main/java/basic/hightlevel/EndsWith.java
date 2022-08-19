package basic.hightlevel;

public class EndsWith {

    /**
     * ...Проверить что массив word имеет последние элементы, одинаковые с массивом post
     * П,р,и,в,е,т -> в,е,т -> true
     * П,р,и,в,е,т -> в,у,т -> false
     * Переменная типа char инициализируется следующим образом (пример), char symbol = 'a'
     * char - это символ (какой-то один)
     */

    public static boolean endsWith(char[] word, char[] post) {

        if (word.length < post.length || post.length == 0) {
            return false;
        } else {
            for (int i = 0; i < post.length; i++) {
                int indexPost = word.length - post.length;
                if (post[i] != word[indexPost + i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
