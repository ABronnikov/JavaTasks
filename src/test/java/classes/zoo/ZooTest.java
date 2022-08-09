package classes.zoo;

import hightlevel.ChangeData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZooTest {

    @Test
    void test0_getTheLargestNumberOfAnimalsInTheZoo() {
        Animal animal1 = new Animal("Кот", "cat");
        Animal animal2 = new Animal("Собака", "dog");
        Animal animal3 = new Animal("Хомяк", "hamster");
        Animal animal4 = new Animal("Попугай", "parrot");
        Animal animal5 = new Animal("Крыса", "rat");
        Animal animal6 = new Animal("Мышь", "mouse");
        Animal animal7 = new Animal("Кролик", "rabbit");
        Animal animal8 = new Animal("Корова", "cow");
        Animal animal9 = new Animal("Козел", "goat");
        Zoo zoo1 = new Zoo("Zoo1", new Animal[]{animal1, animal2, animal3, animal4}, 3.5);
        Zoo zoo2 = new Zoo("Zoo2", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6}, 4.5);
        Zoo zoo3 = new Zoo("Zoo3", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8, animal9}, 3.8);
        Zoo zoo4 = new Zoo("Zoo4", new Animal[]{animal1, animal2, animal3, animal4, animal5}, 5.1);
        Zoo zoo5 = new Zoo("Zoo5", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6, animal7}, 2.6);
        Zoo zoo6 = new Zoo("Zoo6", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8}, 4.2);
        Zoo[] zoos = {zoo1, zoo2, zoo3, zoo4, zoo5, zoo6};
        String result = Zoo.getTheLargestNumberOfAnimalsInTheZoo(zoos);
        String expected = "Zoo3";
        Assertions.assertEquals(expected,result);
    }

    @Test
    void test1_getTheLargestNumberOfAnimalsInTheZoo() {
        Zoo[] zoos = {};
        String result = Zoo.getTheLargestNumberOfAnimalsInTheZoo(zoos);
        String expected = "";
        Assertions.assertEquals(expected,result);
    }

    @Test
    void test2_getAverageTicketPriceInZoos() {
        Animal animal1 = new Animal("Кот", "cat");
        Animal animal2 = new Animal("Собака", "dog");
        Animal animal3 = new Animal("Хомяк", "hamster");
        Animal animal4 = new Animal("Попугай", "parrot");
        Animal animal5 = new Animal("Крыса", "rat");
        Animal animal6 = new Animal("Мышь", "mouse");
        Animal animal7 = new Animal("Кролик", "rabbit");
        Animal animal8 = new Animal("Корова", "cow");
        Animal animal9 = new Animal("Козел", "goat");
        Zoo zoo1 = new Zoo("Zoo1", new Animal[]{animal1, animal2, animal3, animal4}, 3.5);
        Zoo zoo2 = new Zoo("Zoo2", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6}, 4.5);
        Zoo zoo3 = new Zoo("Zoo3", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8, animal9}, 3.8);
        Zoo zoo4 = new Zoo("Zoo4", new Animal[]{animal1, animal2, animal3, animal4, animal5}, 5.1);
        Zoo zoo5 = new Zoo("Zoo5", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6, animal7}, 2.6);
        Zoo zoo6 = new Zoo("Zoo6", new Animal[]{animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8}, 4.2);
        Zoo[] zoos = {zoo1, zoo2, zoo3, zoo4, zoo5, zoo6};
        double result = Zoo.getAverageTicketPriceInZoos(zoos);
        double expected = 3.95;
        Assertions.assertEquals(expected,result);
    }

    @Test
    void test3_getAverageTicketPriceInZoos() {
        Zoo[] zoos = {};
        double result = Zoo.getAverageTicketPriceInZoos(zoos);
        double expected = 0;
        Assertions.assertEquals(expected,result);
    }
}