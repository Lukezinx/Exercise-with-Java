public class Hero {

    private int magazine;


    public Hero(int magazine) {
        this.magazine = magazine;
    }

    public int getMagazine() {
        return magazine;
    }

    public class Weapon {
        public void Shoot() {
            magazine--;
        }
    }
}
