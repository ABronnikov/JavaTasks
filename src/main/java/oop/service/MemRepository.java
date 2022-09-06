package oop.service;

public class MemRepository implements Store {

    public String[] findAll() {
        return new String[] {"Nikita Nesterenko", "Danila Orbanin", "Andrey Zaikovich"};
    }
}
