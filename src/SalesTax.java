public class SalesTax {

    private String itemName;

    public SalesTax(String itemName) {

        this.itemName = itemName;
    }

    public double calculateTax(double price, boolean imported, boolean exempted) {
        return 1d;
    }
}
