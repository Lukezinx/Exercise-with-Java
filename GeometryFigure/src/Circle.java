public class Circle implements Shape {

    private final double radios;

    public  Circle(double radios) {
         this.radios = radios;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * Math.pow(radios, 2);
    }
}
