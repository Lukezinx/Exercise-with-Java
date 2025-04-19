import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


public class Project {

        public static void main(String[] args) {


            Products pc1 = new Products("TV", 200.00,"BRL");
            Products pc2 = new Products("Tablet", 200.00,"EUR");
            Products pc3 = new Products("notebook", 200.00,"USD");

            PrintWriter out = new PrintWriter(System.out,true, StandardCharsets.UTF_8);

            out.print(pc1);
            out.print(pc2);
            out.print(pc3);
        }
}


