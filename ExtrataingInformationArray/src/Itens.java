public class Itens {
    private String name;
    private int price;

    public Itens() {
    }

    public Itens(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Object[] extrating (Itens[] Itens ) {
        Itens highestPrice = Itens[0];
        Itens lowestPrice = Itens[0];
        int price = 0;

        for(Itens itens : Itens) {
            if(itens.getPrice() > highestPrice.getPrice()) {
                highestPrice = itens;
            }

            if(itens.getPrice() < lowestPrice.getPrice()) {
                lowestPrice = itens;
            }

            price += itens.getPrice();
        }
        double sum =  (double) price / Itens.length;

//        for(int i = 0; i < Itens.length;i++ ){
//            int sumPrice = Itens[i].getPrice();
//            price += sumPrice;
//
//            if(Itens[i].getPrice() > highestPrice.getPrice() ) {
//                highestPrice = Itens[i];
//            }
//
//            if(Itens[i].getPrice() < lowestPrice.getPrice() ) {
//                lowestPrice = Itens[i];
//            }
//
//        }


        return new Object[]{highestPrice, lowestPrice,sum};
    }

    @Override
    public String toString() {
        return "Itens{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
