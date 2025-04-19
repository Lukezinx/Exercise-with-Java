package Animals;
import Habitat.SwinPet;
public class Fish extends SwinPet {
    public Fish(String color, String swin) {
        super(color, swin);
    }

    @Override
    public String swin() {
        return "nandando";
    }

    @Override
    public String toString() {
        return "Fish{" +
                "Swin='" + Swin + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
