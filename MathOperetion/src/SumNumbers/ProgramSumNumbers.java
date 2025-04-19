package SumNumbers;

public class ProgramSumNumbers implements Operation {

    @Override
    public int execulte(Integer n1, Integer n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {


        ProgramSumNumbers p = new ProgramSumNumbers();
        

        System.out.println(p.execulte(2, 4));

    }
}
