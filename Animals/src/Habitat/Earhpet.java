package Habitat;

import Pets.Pets;

public class Earhpet extends Pets {

    private String walk;
    protected String talk;


    public Earhpet(String color, String walk, String talk) {
        super(color);
        this.walk = walk;
        this.talk = talk;

    }

    public String getWalk() {
        return walk;
    }


    public String getTalk() {
        return talk;
    }



    public String talk() {
        return "andando";
    }
}
