package ClassesAndObjects;

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    Date birthDate;

    public Person(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = new Date(day, month, year);
    }

    public int getAge() {
        LocalDate dateOfDay = getDateOfDate();
        int year = dateOfDay.getYear();
        int yearFromP = birthDate.year;

        int age = year - yearFromP;
        if(dateOfDay.getMonthValue() < birthDate.month ||
                ( dateOfDay.getDayOfMonth() == birthDate.month &&
                        dateOfDay.getDayOfMonth() > birthDate.day)) {
            --age;
        }

        return age;
    }

    public static LocalDate getDateOfDate() {
        return LocalDate.now();
    }

    public String toString() {
        return String.format("%s %s est né le %s", lastName, firstName, birthDate);
    }
}
