/**
    * Represent a cafe Customer.
    * @author Tag Angel Rose & Calibgos Julie Ann
    * @version 5.0
   */


public class Customer {
    private String name;
    private boolean student;
    private int loyaltyPoints;

    public Customer() {
        this.name = "Unknown";
        this.student = false;
        this.loyaltyPoints = 0;
    }
    
    public Customer(String name) {
      this.name = name;
      this.student = false;
      this.loyaltyPoints = 0;
    }

    Customer(String name, boolean student) {
        this.name = name;
        this.student = student;
        loyaltyPoints = 0;
    }

    public void addPoints(int points) {
        if (points > 0) {
            loyaltyPoints += points;
        }
        
    }

    public void addPoints(double amount) {
        if (amount > 0) {
            loyaltyPoints += (int)(amount / 50);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int points) {
        if (points >= 0) {
            loyaltyPoints = points;
        }
    }
    
    }
