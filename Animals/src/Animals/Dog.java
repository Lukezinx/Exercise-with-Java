package Animals;
import Habitat.Earhpet;
public class Dog extends Earhpet {

    public Dog() {
        super("vermelho", "andando", "falando" );
    }

    @Override
    public String talk() {
        return "au-au";
    }
}
