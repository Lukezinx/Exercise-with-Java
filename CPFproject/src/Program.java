public class Program {

    public static void main(String[] args ) {

        CpfMethod cm = new CpfMethod("123.456.789-90");
        CpfMethod cm2 = new CpfMethod("124 496 789 90");
        CpfMethod cm3 = new CpfMethod("12345678990");


        System.out.println(cm.Validatecpf());
        System.out.println(cm2.Validatecpf());
        System.out.println(cm3.Validatecpf());


    }
}
