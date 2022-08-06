package hightlevel;

public class EndsWith {

    /**
     * ...Проверить что массив word имеет последние элементы, одинаковые с массивом post
     * П,р,и,в,е,т -> в,е,т -> true
     * П,р,и,в,е,т -> в,у,т -> false
     * Переменная типа char инициализируется следующим образом (пример), char symbol = 'a'
     * char - это символ (какой-то один)
     */

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        if (word.length < post.length || post.length == 0) {
            result = false;
        } else {
            for (int i = 0; i < post.length; i++) {
                int indexPost = word.length - post.length;
                if (post[i] != word[indexPost + i]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
