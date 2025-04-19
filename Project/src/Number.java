public class Number {
    private  static int INSTANCE;
    private  int number;

    private Number(int number) {
        this.number = number;
        INSTANCE++;
    }

    public int getNumber() {
        return  number;
    }

    public static int getINSTANCE() {
        return INSTANCE;
    }

    public static Number add(Number n1, Number n2) {
         return new Number(n1.getNumber() + n2.getNumber());
    }

    public static Number newNumber(int n) {
       return new Number(n);

    }


}
