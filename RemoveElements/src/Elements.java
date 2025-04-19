
public class Elements   {

    private String elementOne;


    public Elements(String elementOne) {
        this.elementOne = elementOne;
    }


//    you can use \\d
    public String RemoveElements() {
        return elementOne.replaceAll("[0-9]", "");

    }

//    you can use \\D
    public String RemoveCaracthere () {
        return elementOne.replaceAll("[^0-9]", "");
    }




}
