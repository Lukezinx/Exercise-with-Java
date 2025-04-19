package Pets;

import Animals.Dog;
import Animals.Fish;
import Habitat.Earhpet;

public class Pets {

    protected String color;

    public String getColor() {
        return color;
    }

    public Pets(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Earhpet ep = new Earhpet("vermelho", "andando", "falando");

        System.out.println(ep.talk());
        Dog d = new Dog();
        System.out.println(d.talk());


        Fish f = new Fish("azul", "nadando");
        System.out.println(f);


        System.out.println(f.swin());

    }
}
