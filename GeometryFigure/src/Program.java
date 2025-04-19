public class Program {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double r = calculator.sumSurfaceArea(new Circle(5));


        System.out.println(r);
    }
}
