public class ExWatch {

    public static void main(String[] args) {


        watch clock = new watch();
        clock.setTimer(11,30,40);
        System.out.println(clock.readHour() + ":" + clock.readMinutes() + ":" + clock.readSecond());
        System.out.println(clock.hour);
        System.out.println(clock.minute);
        System.out.println(clock.second);
    }
}
