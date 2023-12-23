package seminars.seminar1;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        BottleOfWater bottleOfWater = new BottleOfWater("cola", 123, 1.5);
        BottleOfWater bottleOfWater1 = new BottleOfWater("cola1", 345, 2.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("cola2", 96, 0.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("cola3", 555, 5);
        BottleOfWater bottleOfWater4 = new BottleOfWater("cola4", 888, 15);
        Set<Product> productList = new HashSet();
        productList.add(bottleOfWater);
        productList.add(bottleOfWater1);
        productList.add(bottleOfWater2);
        productList.add(bottleOfWater3);
        productList.add(bottleOfWater4);    
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("cola"));
    } 
}
