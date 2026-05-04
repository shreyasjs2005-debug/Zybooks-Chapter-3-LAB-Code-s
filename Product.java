import java.util.Scanner;

public class Product {
   // Build Product class with public methods and private fields listed above
     
   /* Type your code here. */
   private String code;
   private double price;
   private int count;

   public Product(String code, double price, int count) {
    this.code = code;
    this.price = price;
    this.count = count;
   }

   public void setCode(String code) {
    this.code = code;
   }

   public String getCode() {
    return code;
   }

   public void setPrice(double p) {
    price = p;
   }

   public double getPrice() {
    return price;
   }

   public void setCount(int num) {
    count = num;
   }

   public int getCount() {
    return count;
   }

   public void addInventory (int amt) {
    count = count + amt;
   }

   public void sellInventory(int amt) {
   count = count - amt;
}
   // main
   public static void main(String args[]) {
      String name = "Apple";
      double price = 0.40;
      int num = 3;
      Product prod = new Product(name, price, num);

      // Test 1 - Are instance variables set/returned properly?
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice()); 
      System.out.println("Count: " + prod.getCount());
      System.out.println();

      // Test 2 - Are instance variables set/returned properly after adding and selling?
      num = 10;
      prod.addInventory(num);
      num = 5;
      prod.sellInventory(num);
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice());
      System.out.println("Count: " + prod.getCount());
      System.out.println();

      // Test 3 - Do setters work properly?
      name = "Golden Delicious";
      prod.setCode(name);
	   price = 0.55;
      prod.setPrice(price);
      num = 4;
      prod.setCount(num);
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice()); 
      System.out.println("Count: " + prod.getCount()); 
   }
}
