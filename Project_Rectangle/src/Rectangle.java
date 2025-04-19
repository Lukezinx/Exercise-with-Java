public class Rectangle {
    private final Double sideA;
    private final Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(Double sideA) {
        this(sideA, sideA);

    }

    public Double getSideA() {
        return sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public double Square() {
        if(getSideA().equals(getSideB())) {
            return getSideA() * getSideA();
        }
        return getSideA() * getSideB();
    }

    public void print() {
        System.out.println(Square());
    }

}
