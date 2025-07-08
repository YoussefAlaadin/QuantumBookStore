public class QuantumBookstore {
    private Inventory inventory;

    public QuantumBookstore(Inventory inventory) {
        this.inventory = inventory;
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.findBookByISBN(isbn);

        if (book == null) {
            System.out.println("Book with ISBN [" + isbn + "] not found!");
            return;
        }
        if (!book.isForSale()) {
            System.out.println("This demo book is not for sale!");
            return;
        }


        if (!(book instanceof PurchasableBook purchasableBook)) {
            System.out.println("This book is not for purchasing!");
            return;
        }
        double totalPrice = book.getPrice() * quantity;
        if (book instanceof PaperBook paperBook) {
            try {
                paperBook.reduceStock(quantity);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        System.out.println("Book purchased: " + book.getInfo());
        System.out.println("Total price: " + totalPrice + " EGP");
        purchasableBook.sendingType(email, address);
    }
}
