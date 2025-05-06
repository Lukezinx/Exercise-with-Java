public class Aplicattion {

    public static void main(String[] args) {
        Hero h = new Hero(20);
        Hero.Weapon w = h.new Weapon();

        w.Shoot();
        w.Shoot();
        w.Shoot();
        w.Shoot();
        w.Shoot();

        System.out.println(h.getMagazine());


    }
}
