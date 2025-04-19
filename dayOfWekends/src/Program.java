public class Program {

    public static void main(String[] args) {

        DaysWekend dow = DaysWekend.MONDAY.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

    }
}