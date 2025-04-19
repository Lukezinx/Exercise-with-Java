import java.util.Random;

public class Dice {
    private int dice1;
    private int dice2;


    public int Roll() {
        Random r = new Random();
        for (int i = 0; i < 2; i++) {
            dice1 = r.nextInt(1,6);
            for (int j = 0; j < 2; j++) {
                dice2 = r.nextInt(1,6);
                return dice2;
            }
        }
        return dice1;
    }


}



