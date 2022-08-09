package classes.auto;

import java.util.Objects;

/**
 * 1. Создать класс автомобиль.
 * Автомобиль имеет модель (String), марку (String), количество пассажарских мест (int), тип коробки передач (String).
 * Доработать класс AutoService.
 * 2. Создать метод который найдет все автомобили Mercedes E-класса, не важно какой конкретной модели.
 * Принято считать что автомобили типа Mercedes E-класс хранятся в массиве с приставкой Mercedes-E.
 * Mercedes-E, Citroen C4, Mercedes-С это модели марка Mercedes, Citroen
 * 3. Нужно задуматься как избежать дублирования кода в обоих методах, возможно изменить структуру класса полностью.
 * 4. Написать unit тесты.
 */

public class Auto {

    private final String model;
    private final String brand;
    private final String numberOfPassengerSeats;
    private final String transmissionType;

    public Auto(String model, String brand, String numberOfPassengerSeats, String transmissionType) {
        this.model = model;
        this.brand = brand;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.transmissionType = transmissionType;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return getModel().equals(auto.getModel()) && getBrand().equals(auto.getBrand()) && getNumberOfPassengerSeats().equals(auto.getNumberOfPassengerSeats()) && getTransmissionType().equals(auto.getTransmissionType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getBrand(), getNumberOfPassengerSeats(), getTransmissionType());
    }
}
