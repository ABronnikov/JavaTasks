package oop.service;

public class Service {

    private final String SPACE_DELIMITER = " ";

    private final MemRepository memRepository;

    public Service(MemRepository memRepository) {
        this.memRepository = memRepository;
    }

    public void getOnlyName() {
        for (String string : memRepository.findAll()) {
            System.out.println(string.split(SPACE_DELIMITER)[0]);
        }
    }
}
