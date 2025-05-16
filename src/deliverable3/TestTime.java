package deliverable3;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        System.out.printf("t1: %s\nt2: %s", t1, t2);

        t1.nextSecond();
        t2.previousSecond();

        System.out.printf("\n\nAfter Changing Seconds:\nt1: %s\nt2: %s", t1, t2);

    }
}
