package basic.branchoperators.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Базовые элементы бота
 */
public class TelegramBotBasic {

    public static void main(String[] args) throws IOException {

        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number;
            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Enter number please.. only number =) And not big.");
                bufferedReader.close();
                break;
            }

            switch (number) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Buy");
                    break;
                case 3:
                    System.out.println("What??");
                    break;
                default:
                    System.out.println("I don't understand you, I'm turning off");
                    bufferedReader.close();
                    break;
            }
        }
    }
}
