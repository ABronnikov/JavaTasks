package basic.classes.auto;

/**
 * Сервис по работе с автомобилями
 */
public class AutoService {

    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */
    public static Auto[] getOnlyBmwCars(Auto[] autos) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getBrand().equals("BMW")) {
                count++;
            }
        }

        Auto[] autosBMV = new Auto[count];

        for (int i = autos.length - 1; i >= 0; i--) {
            if (autos[i].getBrand().equals("BMW")) {
                count--;
                autosBMV[count] = autos[i];
            }
        }

        return autosBMV;
    }

    /**
     * Данный метод возвращает автомобили марки Mercedes E-класса
     * @param autos все автомобили
     * @return массив автомобилей Mercedes E-класса.
     */
    public static Auto[] getOnlyMercedesE(Auto[] autos) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getModel().equals("Mercedes-E")) {
                count++;
            }
        }

        Auto[] autosOnlyMercedesE = new Auto[count];

        for (int i = autos.length - 1; i >= 0; i--) {
            if (autos[i].getModel().equals("Mercedes-E")) {
                count--;
                autosOnlyMercedesE[count] = autos[i];
            }
        }

        return autosOnlyMercedesE;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public static Auto[] getSportCars(Auto[] autos) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getNumberOfPassengerSeats().equals("two-seater")) {
                count++;
            }
        }

        Auto[] autosSportCars = new Auto[count];

        for (int i = autos.length - 1; i >= 0; i--) {
            if (autos[i].getNumberOfPassengerSeats().equals("two-seater")) {
                count--;
                autosSportCars[count] = autos[i];
            }
        }

        return autosSportCars;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public static Auto[] getOnlyAutomaticTypeCars(Auto[] autos) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getTransmissionType().equals("automatic")) {
                count++;
            }
        }

        Auto[] autosOnlyAutomaticType = new Auto[count];

        for (int i = autos.length - 1; i >= 0; i--) {
            if (autos[i].getTransmissionType().equals("automatic")) {
                count--;
                autosOnlyAutomaticType[count] = autos[i];
            }
        }

        return autosOnlyAutomaticType;
    }
}