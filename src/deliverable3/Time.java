package deliverable3;

public class Time {
    private int hour; //[0 - 23]
    private int minute; //[0 - 59]
    private int second; //[0 - 59]

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    //Instance Methods
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public Time nextSecond() {
        setSecond(this.second + 1);
        return this;
    }

    public Time previousSecond() {
        setSecond(this.second - 1);
        return this;
    }


    //Getter Methods
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }


    //Setter Methods
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
