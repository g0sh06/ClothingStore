package ClothingStore;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cashier {
    static double sumtotal = 0;
    static double discount3products = 0.20;
    static double discountOnShirts = 0.10;
    static double discountAllShoes = 0.25;
    static double discount = 0;
    static double FinalDiscound;


    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        ArrayList<Object> products = new ArrayList<>();

        Object Shirt = new Object("Blue Cotton Shirt", "BrandS", 24.99, "M", "Blue ");
        products.add(Shirt);
        Object Trousers = new Object("Black Cotton Trousers", "BrandS", 35.99, "M", "White");
        products.add(Trousers);
        Object Shoes = new Object("Black Leather Shoes", "BrandS", 59.99, "43", "Black");
        products.add(Shoes);
        Object Jacket = new Object("Black Cotton Suit Jacket", "BrandJ", 99.99, "50", "Black");
        products.add(Jacket);

        LocalDate localDate = LocalDate.of(2022, Month.MARCH, 30);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(localDate);

        
        System.out.println("---Products---");


        if (dayOfWeek == DayOfWeek.WEDNESDAY) {
            for (int y = 0; y < products.size(); y++) {
                System.out.println(products.get(y).name + " - " + products.get(y).brand + "\n" + " Price: " + products.get(y).price);
                if (products.get(y).name.contains("Shirt") == true) {
                    discount = products.get(y).price * 0.10;
                    FinalDiscound += discount;
                }
                if (products.get(y).name.contains("Shoes") == true) {
                    discount = products.get(y).price * 0.25;
                    FinalDiscound += discount;
                }
                System.out.println(" #Discount " + discount + "\n");
                sumtotal += products.get(y).price;
                FinalDiscound += discount;
            }
        }else{
            if (products.size() > 3) {
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i).name + " - " + products.get(i).brand + "\n" + " $" + products.get(i).price);
                    sumtotal += products.get(i).price;
                    discount = products.get(i).price * 0.20;
                    System.out.println(" #discount -" + discount + "\n");
                    FinalDiscound += discount;
                }
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("SUBTOTAL: " + sumtotal);
        System.out.println("DISCOUNT: -" + FinalDiscound);
        System.out.println("TOTAL: $" + (sumtotal - FinalDiscound));

    }
}
