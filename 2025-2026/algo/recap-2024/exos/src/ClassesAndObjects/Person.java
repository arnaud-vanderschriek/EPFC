package ClassesAndObjects;

public class Person {
    String firstName;
    String lastName;
    Date dateOfBirth;

    public Person(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(day, month, year);
    }

    // public String toString() {
}

/*
    public int getAge() {
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
    }
*/

