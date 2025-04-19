package Habitat;
import Pets.Pets;
public class SwinPet extends Pets {
    protected String Swin;

    public SwinPet(String color, String swin) {
        super(color);
        Swin = swin;
    }


    public String swin() {
        return "dançando";
    }
}
