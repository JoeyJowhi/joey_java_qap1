package deliverable2;

public class Date {
    private int day; //[1 - 31]
    private int month; //[1 - 12]
    private int year; //[1900 - 9999]

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    //Instance Methods
    public String toString() {
        return String.format("%02d/%02d/%d", this.day, this.month, this.year);
    }


    //Getter Methods
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }


    //Setter Methods
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
}