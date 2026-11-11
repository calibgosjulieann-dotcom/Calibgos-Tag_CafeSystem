/**
  *Abstract parent class for cafe MenuItem.
  * @author Calibgos Julie Ann & Tag Angel Rose
  * @version 1.0
  */

public abstract class MenuItem {
    protected String name;
    protected double basePrice;
    private String itemCode;

//default Constructor
    public MenuItem() {
        name = "Unnamed item";
        basePrice = 0;
        itemCode = "N/A";
    }
//parameterized Constructor
    MenuItem(String name, double basePrice, String itemCode) {
        this.name = name;
        this.basePrice = basePrice;
        this.itemCode = itemCode;
    }

    public abstract double computePrice();

    public String getDescription() {
        return name + " [" + itemCode + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("base price cannot be negative");
        }
        this.basePrice = basePrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
