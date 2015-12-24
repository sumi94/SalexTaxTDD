import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShopTest {
    @Test
    public void addItemToShopList() {

        Item item1 = Mockito.mock(Item.class);
        when(item1.calculateSalesTax()).thenReturn(0.5);

        Item item2 = Mockito.mock(Item.class);
        when(item2.calculateSalesTax()).thenReturn(0.4);

        ArrayList<Item> itemList=new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);
        ShopList shoplist = new ShopList(itemList);
        double totalBill = shoplist.calculateBill();
        assertEquals(0.9, totalBill, 0.001);

        verify(item1).calculateSalesTax();
        verify(item2).calculateSalesTax();
    }

}
