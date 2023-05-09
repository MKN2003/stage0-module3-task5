package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        minutes = 11.5F;
        float seconds = 60.0F;
        minutes *= seconds;

        System.out.println(minutes);
    }
}
