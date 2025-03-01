package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int newDay) {
        day = newDay;
    }
    public void setMonth(int newMonth) {
        month = newMonth;
    }
    public void setYear(int newYear) {
        year = newYear;
    }
    public void setDate( int d, int m, int y ) {
        day = d;
        month = m;
        year = y;
    }
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year); // %02d = 2 dígitos
    } // dar formato a cadena de texto.

}

