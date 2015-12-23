public class SalesTax {

    private String itemName;

    public SalesTax(String itemName) {

        this.itemName = itemName;
    }

    public double calculateTax(double price, boolean imported, boolean exempted) {

        double taxCalculated = 0d;

        if(imported == true){
            taxCalculated = taxCalculated + (price * 5.0 / 100.0);
        }
        taxCalculated = taxCalculated + price * 10.0 / 100.0;

        return taxCalculated;
    }
}
