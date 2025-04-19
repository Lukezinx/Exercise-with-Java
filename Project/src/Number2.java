public class Number2 {
    public static void main(String[] args) {

        var n1 = Number.newNumber(10);
        var n2 = Number.newNumber(20);

        var n3 = Number.add(n1,n2);
        System.out.println(n3.getNumber());

        System.out.println(Number.getINSTANCE());
    }
}
