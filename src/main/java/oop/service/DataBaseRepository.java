package oop.service;

public class DataBaseRepository implements Store {

    public String[] findAll() {
        return new String[] {"index=1;Nikita Nesterenko", "index=2;Danila Orbanin", "index=3;Andrey Zaikovich"};
    }
}
