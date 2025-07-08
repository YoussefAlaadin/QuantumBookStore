public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int year; // year the book was published
    protected double price;

    public Book(String ISBN, String title, int year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getInfo() {
        return "[" + ISBN + "] " + title +  " (" + year + ") - " + price + " EGP";
    }

    public abstract boolean isForSale();
}


