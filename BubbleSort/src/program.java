import java.util.Arrays;

public class program {

    public static void main(String[] args) {
        int[] item = new int[]{2,4,7,6,9,5};
        Bubble(item);
        System.out.println(Arrays.toString(item));

    }

    public static void Bubble(int[] array) {
        int items = array.length;
        boolean trade;

        do{
            trade = false;
            for(int i = 0; i < items - 1; i++){
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trade = true;
                }

            }

        } while (trade);

    }
}
