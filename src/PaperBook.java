public class PaperBook extends Book implements PurchasableBook{
    public int stock;
    public PaperBook(String ISBN, String title, int year, double price, int stock) {
        super(ISBN, title, year, price);
        this.stock=stock;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
     if(quantity>stock){
         throw new IllegalArgumentException("Error! Not enough stock for "+ISBN);
     }
     stock -= quantity;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void sendingType(String email, String address) {
        System.out.println("Shipping paper book: "+ title+ " at " + address);
    }


}
