/**
   * inheritance a Meal to MenuItem.
   * @author Tag Angel Rose & Calibgos Julie Ann
   * @version 4.0
  */

public class Meal extends MenuItem {
    private boolean upsized;
    private int extraSides;

//default Constructor
    public Meal() {
        super();
        upsized = false;
        extraSides = 0;
    }

//Parameterized
    Meal(String name, double basePrice, String itemCode, boolean upsized, int extraSides) {
        super(name, basePrice, itemCode);
        this.upsized = upsized;
        this.extraSides = extraSides;
    }

    @Override
    public double computePrice() {
        double price = basePrice;

        if (upsized) {
            price += 20;
        }

        price += extraSides * 12;

        return price;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + (upsized ? " Upsized" : " Regular")
                + ", " + extraSides + " extra sides";
    }

    public boolean isUpsized() {
        return upsized;
    }

    public void setUpsized(boolean upsized) {
        this.upsized = upsized;
    }

    public int getExtraSides() {
        return extraSides;
    }

    public void setExtraSides(int extraSides) {
        if (extraSides >= 0) {
            this.extraSides = extraSides;
        }
    }
}
