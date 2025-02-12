package es.uah.matcomp.mp.e1.ejerciciosclases;
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newHour) {
        hour = newHour;
    }

    public void setMinute(int newMinute) {
        minute = newMinute;
    }

    public void setSecond(int newSecond) {
        second = newSecond;
    }

    public void setTime(int newHour, int newMinute, int newSecond) {
        hour = newHour;
        minute = newMinute;
        second = newSecond;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond() {
        second += 1;
        if (second == 60) {
            second = 0;
            minute += 1;
        }
        if (minute == 60) {
            minute = 0;
            hour = (hour + 1) % 24; // Esto garantiza que cuando hour llegue a 24, se reinicie a 0.
        }
        return new Time(hour, minute, second);
    }

    public Time previousSecond() {
        second -= 1;
        if (second == -1) {
            second = 59;
            minute -= 1;
        }
        if (minute == -1) {
            minute = 59;
            hour = (hour == 0) ? 23 : hour - 1; // Si hour es 0, se asigna 23 (pasando de 00:00:00 a 23:59:59). Si hour no es 0, simplemente se le resta 1.
        }
        return new Time(hour, minute, second);

    }


    public String ToString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
