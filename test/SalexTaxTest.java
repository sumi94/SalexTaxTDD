import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalexTaxTest {
    @Test
    public void calculateSalexTaxForBookOf10RupeesNotImportedNotExempted() {
        SalesTax salesTax = new SalesTax("Book");
        boolean imported = false;
        boolean exempted = false;
        double salestax = salesTax.calculateTax(10d, imported, exempted);
        assertEquals(1d, salestax, 0.001);
    }

    @Test
    public void calculateSalesTaxForBookOf100RupeesNotImportedNotExempted() {
        SalesTax salesTax = new SalesTax("Book");
        boolean imported = false;
        boolean exempted = false;
        double salestax = salesTax.calculateTax(100d, imported, exempted);
        assertEquals(10d, salestax, 0.001);
    }

    @Test
    public void calculateSalesTaxForBookNotImportedNotExempted() {
        SalesTax salesTax = new SalesTax("Book");
        boolean imported = false;
        boolean exempted = false;
        double salestax = salesTax.calculateTax(14.99, imported, exempted);
        assertEquals(1.5d, salestax, 0.001);
    }

    @Test
    public void calculateSalexTaxForBookOf100RupeesImportedNotExempted() {
        SalesTax salesTax = new SalesTax("Book");
        boolean imported = true;
        boolean exempted = false;
        double salestax = salesTax.calculateTax(100d, imported, exempted);
        assertEquals(15d, salestax, 0.001);
    }


}
