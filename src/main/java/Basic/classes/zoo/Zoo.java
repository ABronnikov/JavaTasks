package Basic.classes.zoo;

/**
 * 1. Создать класс Зоопарк. Создать класс Животное.
 * Зоопарк имеет цену за билет (double), имеет несколько животных (массив Animal), имеет название (String)
 * 2. Создать метод который определит из общего количества зоопарков среднюю стоймость билета.
 * 3. Создать метод который найдет названия зоопарка который имеет самое большое количество животных.
 * 4. Написать unit тесты на все методы.
 */

public class Zoo {

    private final String nameZoo;
    private final Animal[] animals;
    private final double pricePerTicket;

    public Zoo(String nameZoo, Animal[] animals, double pricePerTicket) {
        this.nameZoo = nameZoo;
        this.animals = animals;
        this.pricePerTicket = pricePerTicket;
    }

    public static String getNameByTheLargestCountOfAnimalsByZoo(Zoo[] zoos) {
        String name = "";
        int numberOfAnimals = 0;
        for (Zoo zoo: zoos) {
            if (zoo.getAnimals().length > numberOfAnimals) {
                numberOfAnimals = zoo.getAnimals().length;
                name = zoo.getNameZoo();
            }
        }
        return name;
    }

    public static double getAverageTicketPriceInZoos(Zoo[] zoos) {
        double sumTicketPrice = 0;
        for (Zoo zoo: zoos) {
            sumTicketPrice += zoo.getPricePerTicket();
        }
        return zoos.length != 0 ? Double.parseDouble(String.format("%.2f", (sumTicketPrice / zoos.length))) : 0;
    }

    public String getNameZoo() {
        return nameZoo;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public double getPricePerTicket() {
        return pricePerTicket;
    }
}
