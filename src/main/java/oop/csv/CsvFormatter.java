package oop.csv;

public class CsvFormatter {

    private final String DELIMITER_PERSONS = ";";
    private final String DELIMITER_FIELD = ",";
    private final String DELIMITER_KEY_VALUE = "=";
    private final int LIMIT = 2;

    /**
     * Данный метод принимает строку представленную в формате csv и возвращает массив объектов по
     * параметрам. считается что строка передается в правильном формате.
     *
     * @param csvString строка csv
     */
    public Person[] getPersonsFromCsvFile(String csvString) {
        String[] peopleString = csvString.split(DELIMITER_PERSONS);
        Person[] people = new Person[peopleString.length];
        int index = peopleString.length - 1;
        for (String person: peopleString) {
            people[index] = new Person(
                person.split(DELIMITER_FIELD)[0].split(DELIMITER_KEY_VALUE)[1],
                person.split(DELIMITER_FIELD)[1].split(DELIMITER_KEY_VALUE)[1]);
            index--;
        }
        return people;
    }
}