import java.text.NumberFormat;
import java.util.Currency;

public class Products {

    private final String name;
    private final Double price;
    private final NumberFormat numberformat;


    public Products(String name, Double price, String currenty) {
        this.name = name;
        this.price = price;

        numberformat =  NumberFormat.getCurrencyInstance();
        numberformat.setCurrency(Currency.getInstance(currenty));
    }


    @Override
    public String toString() {
        return String.format("%-15s%-15s", name, numberformat.format(price));
    }
}