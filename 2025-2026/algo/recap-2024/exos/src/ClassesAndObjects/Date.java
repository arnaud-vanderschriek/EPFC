package ClassesAndObjects;
import java.time.LocalDate;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if (day < 1 || day > daysInMonth(this.month == 0 ? 1 : this.month, this.year == 0 ? 2000 : this.year)) {
            throw new RuntimeException();
        }

        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            throw new RuntimeException();
        }

        if(this.day != 0 && this.day > daysInMonth(month, year)) {
            throw new RuntimeException();
        }

        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 1900 || year > 2025) {
            throw new RuntimeException();
        }

        if(this.month != 0 && this.day != 0) {
            if(this.day > daysInMonth(this.month, year)) {
                throw new RuntimeException("Année impossible, à cette date...");
            }
        }

        this.year = year;
    }

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public Date() {
        this(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }

    public static boolean isBisextile(int year) {
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static int daysInMonth(int month, int year) {
        return switch (month) {
            case 2 -> isBisextile(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
    public void increment() {
        day++;
        if(day > daysInMonth(month, year)) {
            day = 1;
            month++;
            if(month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public int dayOfWeek() {
       int q = day;
       int m = month;
        int y = year;
       if(m == 1) {
           m = 13;
           --y;
       } else if (m == 2) {
           m = 14;
           --y;
       }
       int j = y / 100;
       int k = y % 100;

        return (q + ( 13*(m + 1)) / 5 + k + (k/4) + (j/4) + 5*j) % 7;
    }

    public  static String getDayName(int dayofWeek) {
        String[] names = {"Samedi" , "Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi"};
        return names[dayofWeek];
    }

    public  static String getMonthName(int month) {
        String[] names = {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre",
        "octobre", "novembre", "decembre"};
        return names[month - 1];
    }

    public String toString() {
        return getDayName(dayOfWeek()) + " " + day + " " + getMonthName(month) + " " + year;
    }

    public void prettyPrint() {
        System.out.println(this);
    }
}
