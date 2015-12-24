import java.util.ArrayList;
import java.util.Iterator;

public class ShopList {


    private ArrayList<Item> item;

    public ShopList(ArrayList<Item> item) {

        this.item = item;
    }

    public double calculateBill() {

        double totalPrice = 0d;

        for (int i = 0; i < item.size(); i++) {
            Item prsntItem = item.get(i);
            totalPrice += prsntItem.billMe();
        }

        return totalPrice;
    }

    public double calculateTotalTax() {

        double totalTax = 0d;

        for (int i = 0; i < item.size(); i++) {
            Item prsntItem = item.get(i);
            totalTax += prsntItem.calculateSalesTax();
        }

        return totalTax;
    }
}
