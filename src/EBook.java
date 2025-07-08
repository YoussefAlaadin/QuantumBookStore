public class EBook extends Book implements PurchasableBook{
    public String fileType;
    public EBook(String ISBN, String title, int year, double price, String fileType) {
        super(ISBN, title, year, price);
        this.fileType=fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
    @Override
    public void sendingType(String email, String address) {
        System.out.println("Emailing ebook: "+ title+ " to " + email);
    }
}
