import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalexTaxTest {
    @Test
    public void calculateSalexTaxForBookOf10RupeesNotImportedNotExempted() {
        SalesTax salesTax = new SalesTax("Book");
        boolean imported = false;
        boolean exempted = false;
        double salestax = salesTax.calculateTax(10d, imported, exempted);
        assertEquals(1d, salestax, 0.0001);
    }

}
