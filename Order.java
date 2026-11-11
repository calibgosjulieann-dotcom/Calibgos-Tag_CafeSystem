/**
    * Represent a cafe Order.
    * @author Tag Angel Rose & Calibgos Julie Ann
    * @version 6.0
   */

public class Order {
    private Customer customer;
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private int itemCount;
    private String orderId;

//Constructor
    Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addItem(MenuItem item) {
        if (itemCount == 0) {
            item1 = item;
            itemCount++;
        } else if (itemCount == 1) {
            item2 = item;
            itemCount++;
        } else if (itemCount == 2) {
            item3 = item;
            itemCount++;
        } else {
            System.out.println("Order is full! Maximum 3 items.");
        }
    }

    public double computeSubtotal() {
        double total = 0;

        if (item1 != null) {
            total += item1.computePrice();
        }

        if (item2 != null) {
            total += item2.computePrice();
        }

        if (item3 != null) {
            total += item3.computePrice();
        }

        return total;
    }

    public double computeTotal() {
        double total = computeSubtotal();

        if (customer.isStudent()) {
            total = total - (total * 0.10);
        }

        return total;
    }

    public double computeTotal(double voucher) {
        double total = computeTotal() - voucher;

        if (total < 0) {
            total = 0;
        }

        return total;
    }

    public void printReceipt() {
        printReceipt(0);
    }

    public void printReceipt(double voucher) {
        System.out.println("\nOrder #" + orderId);
        System.out.println("Customer: " + customer.getName());
        if (customer.isStudent()) {
        System.out.println("Customer Type: Student");
        } else {
        System.out.println("Customer Type: Regular Customer");
    }

        if (item1 != null) {
            System.out.println(item1.getDescription()
                    + " - " + item1.computePrice());
        }

        if (item2 != null) {
            System.out.println(item2.getDescription()
                    + " - " + item2.computePrice());
        }

        if (item3 != null) {
            System.out.println(item3.getDescription()
                    + " - " + item3.computePrice());
        }

        System.out.printf("Subtotal: %.2f%n", computeSubtotal());

        if (customer.isStudent()) {
            System.out.println("Student Discount: 10%");
        }

        if (voucher > 0) {
            System.out.printf("Voucher: %.2f%n", voucher);
        }

        System.out.printf("TOTAL: %.2f%n", computeTotal(voucher));

        customer.addPoints(computeTotal(voucher));

        System.out.println("Loyalty Points: "
                + customer.getLoyaltyPoints());
        }
        
  }
