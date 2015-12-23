import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void calculateSalexTaxForBookOf10RupeesNotImportedNotExempted() {

        boolean imported = false;
        boolean exempted = false;
        Item item = new Item("Book", 10d, imported, exempted);
        double salestax = item.billMe();
        assertEquals(11d, salestax, 0.001);
    }

    @Test
    public void calculateSalesTaxForBookOf100RupeesNotImportedNotExempted() {

        boolean imported = false;
        boolean exempted = false;
        Item item = new Item("Book", 100d, imported, exempted);
        double salestax = item.billMe();
        assertEquals(110d, salestax, 0.001);
    }

    @Test
    public void calculateSalesTaxForBookNotImportedNotExempted() {

        boolean imported = false;
        boolean exempted = false;
        Item item = new Item("Book", 14.99, imported, exempted);
        double salestax = item.billMe();
        assertEquals(16.49, salestax, 0.001);
    }

    @Test
    public void calculateSalexTaxForBookOf100RupeesImportedNotExempted() {

        boolean imported = true;
        boolean exempted = false;
        Item item = new Item("Book", 100d, imported, exempted);
        double salestax = item.billMe();
        assertEquals(115d, salestax, 0.001);
    }

    @Test
    public void calculateSalexTaxForBookImportedNotExempted() {

        boolean imported = true;
        boolean exempted = false;
        Item item = new Item("Book", 27.99, imported, exempted);
        double salestax = item.billMe();
        assertEquals(32.19, salestax, 0.001);
    }

    @Test
    public void calculateSalexTaxForBookImportedExempted() {

        boolean imported = true;
        boolean exempted = true;
        Item item = new Item("Book", 100d, imported, exempted);
        double salestax = item.billMe();
        assertEquals(105d, salestax, 0.001);
    }

    @Test
    public void calculateSalesTaxForBookNotImportedExempted() {

        boolean imported = false;
        boolean exempted = true;
        Item item = new Item("Book", 0.85, imported, exempted);
        double priceWithBill = item.billMe();
        assertEquals(0.85, priceWithBill, 0.001);
    }

    @Test
    public void calculateSalesTaxForBookRandomCase() {

        boolean imported = false;
        boolean exempted = false;
        Item item = new Item("Book", 18.99, imported, exempted);
        double priceWithBill = item.billMe();
        assertEquals(20.89, priceWithBill, 0.001);
    }

    @Test
    public void calculateOnlySalesTaxForBookRandomCase() {
        boolean imported = false;
        boolean exempted = false;
        Item item = new Item("Book", 18.99, imported, exempted);
        double salesTax = item.calculateSalesTax();
        assertEquals(1.9, salesTax, 0.001);

    }

    @Test
    public void calculateSalesTaxForTwoItems() {
        Item itemBook = new Item("Book", 10.00, false, true);
        double salesTax_book = itemBook.calculateSalesTax();

        Item itemMusic = new Item("Music", 14.99, false, false);
        double salesTax_music = itemMusic.calculateSalesTax();

        Item itemChaco = new Item("Chaco", 0.85, false, true);
        double salesTax_chaco = itemChaco.calculateSalesTax();

        double totalSalesTax = salesTax_book + salesTax_chaco + salesTax_music;

        assertEquals(1.50, totalSalesTax, 0.001);

    }
    

}

