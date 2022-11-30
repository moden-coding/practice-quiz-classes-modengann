

public class App {
    public static void main(String[] args)  {

        StoreProduct a = new StoreProduct("Head of lettuce", 0.65, "Produce", true, 10);
        StoreProduct b = new StoreProduct("Battery", 2.6, 10);
        StoreProduct c = new StoreProduct("Napkins", 1.1);
        StoreProduct d = new StoreProduct("Ketchup", 2.1, "Condiment", true);

        b.expired(true);
        System.out.println("This result should be true. Yours said: " + b.sale(5));
        System.out.println("This result should be false. Yours said: " + b.sale(6));
        
        a.expired(true);
        System.out.println("This result should be false. Yours said: " + a.sale(5));

        System.out.println("The price should be: 1.1. Yours said: " + c.getDiscountedPrice(2));
        System.out.println("The price should be: 1.05. Yours said: " + d.getDiscountedPrice(.5));
    }
}
