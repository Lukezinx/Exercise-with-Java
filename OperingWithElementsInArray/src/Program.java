import java.util.Arrays;
import static java.lang.Math.*;
public class Program {
    public static void main(String[] args) {
        Program n = new Program();

        int[] array = new int[] {7,2,3,4,5,6};
        n.upperNumbers(array);
        System.out.println(Arrays.toString(array));

    }
 //  you also can use static methods :)
    public int[]  upperNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) pow(array[i], 2);
        }
            return array;
    }
}
