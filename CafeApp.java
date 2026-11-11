/**
   * Main class for the Campus Cafe Ordering System.
   * @author Calibgos Julie Ann & Tag Angel Rose 
   * @version Main
  */


public class CafeApp {
    public static void main(String[] args) {
      
      Beverage item = new Beverage ("test drinks", 50, "B-99", "M");

        try {
            item.setBasePrice(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Setter Error | Error: " + e.getMessage());
        }
    
        Customer customer1 = new Customer("Julie Ann A. Calibgos", true);
        Customer customer2 = new Customer("Angel Rose M. Tag", false);
        Customer customer3 = new Customer("MC T. Ambrose", false );
        
        
        Beverage latte = new Beverage(
                "Matcha Latte", 65, "B-01", "L");

        Beverage chocolate = new Beverage(
                "Hot Chocolate", 80, "B-02", "M");

        Pastry ensaymada = new Pastry(
                "Ensaymada", 69, "P-01", true);
           
        Pastry cookie = new Pastry(
                "Cookie", 35, "P-02", false);

        Meal chickenAdobo = new Meal(
                "Chicken Adobo", 105, "M-01", true, 1);

        Meal beefTapa = new Meal(
                "Beef Tapa", 130, "M-02", false, 0);

        Order order1 = new Order("10621", customer1);

        order1.addItem(latte);
        order1.addItem(ensaymada);
        order1.addItem(chickenAdobo);

        order1.printReceipt();

        Order order2 = new Order("10352", customer2);

        order2.addItem(chocolate);
        order2.addItem(beefTapa);
        order2.addItem(cookie);

        order2.printReceipt();
        
        Order order3 = new Order("10543", customer3);
        
        order3.addItem(latte);
        order3.addItem(ensaymada);
        order3.addItem(chickenAdobo);

        
        order3.printReceipt();
    }
}
