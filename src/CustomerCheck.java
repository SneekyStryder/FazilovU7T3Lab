import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        double total = 0.0;
        for (MenuItem thing : check) {
            total += thing.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        for (MenuItem thing : check) {
            if (thing.isDailySpecial()) {
                return false;
            }
        }
        if (totalPrices() < 40) {
            return false;
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        int numCustomers = 0;
        double disc = 0;
        double tip = 0;
        double cost = totalPrices();
        for (MenuItem thing : check) {
            if (thing.isEntree()) {
                numCustomers++;
            }
        }
        if (couponApplies()) {
            disc = cost * 0.25;
        }
        if (numCustomers >= 6) {
            tip = cost * 0.2;
        }
        return cost - disc + tip;
    }
}