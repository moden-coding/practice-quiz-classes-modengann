/* Complete the StoreProduct.java class:

Include the following class variables:

label (String)
price (as an integer)
category (String)
hasExpiration (as a boolean)
stock (represents how many the store has available)

All class variables should be declared as they are described above.

2. Write four constructors: Parameter order should always be: label, price, category, hasExpiration, stock

A constructor that sets all values based on parameters.
A constructor that does not have a category or an expiration (category defaults to "misc", hasExpiration defaults to false)
A constructor that does not have a category, expiration, or stock. Stock defaults 0, expiration defaults to false, and category defaults to “misc”. All other values are set based on parameters.
A constructor that just does not have stock (Stock defaults to 0), but uses parameters to set all other values

3. Write the following methods:

public void expired(boolean hasExpired)

If the product has an expiration date and hasExpired is true, then it should set the stock to 0. Otherwise, nothing happens.
public boolean sale(int quantity)

Check if the quantity (being bought) is available given the stock.

If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).
If there isn't enough, do not adjust the stock and return false instead.
public double getDiscountedPrice(double discount)

The parameter discount should be between .01 and 1 and represent a 0 to 100% discount. If it isn't, do nothing.
Otherwise, multiply the product's price by the (1 - discount) and return that number.

Create several StoreProduct objects using all Constructors and print their fields/states to make sure it's correct (this will not be assessed, but is good way to make sure things are working as you intend).


*/

public class App {
    public static void main(String[] args)  {
        
    }
}
