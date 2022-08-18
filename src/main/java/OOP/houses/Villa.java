package OOP.houses;

public class Villa extends House {

    private Residents residents;

    public Villa(Foundation foundation, Residents residents) {
        super(foundation);
        this.residents = residents;
    }

}
