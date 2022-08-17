package Basic.hightlevel;

import java.util.Arrays;

public class ChangeData {

    /**
     * Nikita Nesterenko, [7 Aug 2022, 04:35:36]:
     * ...Вернуть массив который не содержит четных элементов (должны быть только нечетные элементы)
     *
     * Пример, передаем такой массив - {1, 2, 3, 4, 5, 6, 7, 9}, метод должен вернуть {1, 3, 5, 7, 9}
     */

    public static int[] changeData(int[] data) {
        int count = 0;

        for (int k : data) {
            if (k % 2 != 0) {
                count++;
            }
        }

        int[] dataNotEven = new int[count];

        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] % 2 != 0) {
                count--;
                dataNotEven[count] = data[i];
            }
        }

        return dataNotEven;
    }

    public static int[] changeDataWithStream(int[] data) {
        return Arrays.stream(data).filter(x -> x % 2 != 0).toArray();
    }
}
