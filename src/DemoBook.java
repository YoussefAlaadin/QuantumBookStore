public class DemoBook extends Book{
    public DemoBook(String ISBN, String title, int year, double price) {
        super(ISBN, title, year, price);
    }
    @Override
    public boolean isForSale() {
        return false;
    }
}
