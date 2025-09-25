package ClassesAndObjects;

import java.time.LocalDate;

public class Person {
    public String firstName;
    public String lastName;
    public Date birthDate;

    public Person(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = new Date(day, month, year);
    }

    public static boolean isBirthdatePassed(LocalDate dateOfDay, Date birthDate) {
        return dateOfDay.getMonthValue() < birthDate.getMonth() || (
                dateOfDay.getDayOfMonth() == birthDate.getMonth() &&
                        dateOfDay.getDayOfMonth() > birthDate.getDay());
    }

    public int getAge() {
        LocalDate dateOfDay = getDateOfDate();
        int year = dateOfDay.getYear();
        int yearFromP = birthDate.getYear();

        int age = year - yearFromP;
        if(isBirthdatePassed(dateOfDay, birthDate)) {
            --age;
        }

        return age;
    }

    public static LocalDate getDateOfDate() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return String.format("%s %s est né le %s", lastName, firstName, birthDate);
    }
}
