public class StoreProduct {
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public StoreProduct(String l, double p, String c, boolean h, int s){
        label = l;
        price = p;
        category = c;
        hasExpiration = h;
        stock = s;

    }
    public StoreProduct(String l, double p, int s){
        label = l;
        price = p;
        category = "misc";
        hasExpiration = false;
        stock = s;
    }
    public StoreProduct(String l, double p){
        label = l;
        price = p;
        category = "misc";
        hasExpiration = false;
        stock = 0;
    }
    public StoreProduct(String l, double p, String c, boolean h){
        label = l;
        price = p;
        category = c;
        hasExpiration = h;
        stock = 0;
    }


    public void expired(boolean hasExpired){
        if(hasExpired && hasExpiration){
            stock = 0;
        }

    }

    public boolean sale(int quantity){
        if(quantity <= stock){
            stock -= quantity;
            return true;
        }else{
            return false;
        }
    }
    public double getDiscountedPrice(double discount){
        if(0.01 <= discount && discount <= 1){
            return (1-discount)*price;
        }
        else{
            return price;
        }
    }


        
}
