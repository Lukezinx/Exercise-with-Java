
public class Program {

    public interface Calculator {
        double calculator (double n1, double n2);

    }

    public enum Operation implements Calculator {
        SUM('+') {
            @Override
            public double calculator(double n1, double n2) {
                return n1 + n2;

            }
        },
        SUBTRACT('-') {
            @Override
            public double calculator(double n1, double n2) {
                return n1 - n2;
            }
        },
        MULTIPLY('*') {
            @Override
            public double calculator(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIVIDE('/') {
            @Override
            public double calculator(double n1, double n2) {
                return n1 / n2;
            }
        };


        public final char sybom;


        Operation(char sybom) {
            this.sybom = sybom;
        }

        @Override
        public String toString() {
            return String.valueOf(sybom);

        }
    }


    public static void main(String[] args) {

        System.out.println(Operation.SUM);

        System.out.println(Operation.SUM.calculator(2, 4));


        System.out.println(Operation.DIVIDE);

        System.out.println(Operation.DIVIDE.calculator(4, 2));
        
    }

}
