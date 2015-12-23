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

        if(exempted == false){
            taxCalculated = taxCalculated + price * 10.0 / 100.0;
        }

        taxCalculated = Math.round(taxCalculated * 20.0) / 20.0;

        return taxCalculated;
    }
}
