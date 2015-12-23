public class Item {

    private String itemName;
    private final double price;
    private final boolean imported;
    private final boolean exempted;

    public Item(String itemName, double price, boolean imported, boolean exempted) {

        this.itemName = itemName;
        this.price = price;
        this.imported = imported;
        this.exempted = exempted;
    }

    public double billMe() {

        double tax = calculateSalesTax();

        tax = Math.round(tax * 20.0) / 20.0;
        return price + tax;
    }

    public double calculateSalesTax() {

        double taxCalculated = 0d;

        if(imported == true){
            taxCalculated = taxCalculated + (price * 5.0 / 100.0);
        }

        if(exempted == false){
            taxCalculated = taxCalculated + price * 10.0 / 100.0;
        }

         taxCalculated = Math.round(taxCalculated * 100.0) / 100.0;

        // taxCalculated = Math.round(taxCalculated * 20.0) / 20.0;

        return taxCalculated;
    }
}
