package ClassesAndObjects;

public class Date {
    public int day;
    public int month;
    public int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean isBisextile(int year) {
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static int daysInMonth(int month, int year) {
        return switch (month) {
            case 2 -> isBisextile(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 31;
            default -> 30;
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
       if(m == 1) {
           m = 13;
           --year;
       } else if (m == 2) {
           m = 14;
           --year;
       }
       int y = year;
       int j = year / 100;
       int k = year % 100;

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
