package OOP.houses;

public class Mansion extends House {

    private Residents residents;

    public Mansion(Foundation foundation, Residents residents) {
        super(foundation);
        this.residents = residents;
    }
}
