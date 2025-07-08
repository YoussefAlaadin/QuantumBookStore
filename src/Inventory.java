import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Book> books;

    public Inventory() {
        books= new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to inventory: "+ book.getInfo());
    }

    public boolean removeBookByISBN(String isbn){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if(book.getISBN().equals(isbn)){
                iterator.remove();
                System.out.println("Book removed from inventory: "+ book.getInfo());
                return true;
            }
        }
        System.out.println("Book not found in inventory");
        return false;
    }

    public List<Book> removeOldBooks(int maxAge){
       List<Book> removedOld = new ArrayList<>();
       int currentYear = java.time.Year.now().getValue();
       Iterator<Book> iterator = books.iterator();
       while (iterator.hasNext()){
           Book book = iterator.next();
           int bookAge = currentYear - book.getYear();      // Calc book age
           if(bookAge > maxAge) {
               removedOld.add(book);            //add the old book to outdated books
               iterator.remove();               // remove the old book from the inventory
               System.out.println("Outdated book removed from inventory: "+ book.getInfo());
           }
       }
       return removedOld;
    }

    public Book findBookByISBN(String isbn){        // To buy a specific book
        for(Book book: books){
            if(book.getISBN().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){            //show inventory
        System.out.println("All books in inventory:");
        for(Book book: books){
            System.out.println("# "+ book.getInfo());
        }
    }
}
