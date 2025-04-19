package Animals;
import Habitat.Earhpet;
public class Cat extends Earhpet {
    public Cat() {
        super("vermelho", "andando", "falando" );
    }


    @Override
    public String talk() {
        return "miau";
    }
}
