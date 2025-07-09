        // Add Books Here
        inventory.addBook(new PaperBook("ISBN-001", "Fawry Achievements",  2018, 250.0, 10));
        inventory.addBook(new EBook("ISBN-002", "java From Zero To Hero",  2022, 150.0, "PDF"));
        inventory.addBook(new DemoBook("ISBN-003", "Harry Potter",  2015, 0.0));

        // Preview Current Inventory Here
        System.out.println("\n--- Current Inventory ---");
        inventory.printAllBooks();

        // Buy Paper Book Here
        System.out.println("\n--- Buying Paper Book ---");
        bookstore.buyBook("ISBN-001", 2, "you@example.com", "Cairo, Egypt");

        // Buy E-Book
        System.out.println("\n--- Buying EBook ---");
        bookstore.buyBook("ISBN-002", 1, "you@example.com", "Cairo, Egypt");

        // Buy Demo Book Here
        System.out.println("\n--- Trying to Buy DemoBook ---");
        bookstore.buyBook("ISBN-003", 1, "you@example.com", "Cairo, Egypt");

        // Remove a Book Here
        System.out.println("\n--- Remove Specific Book ---");
        inventory.removeBookByISBN("ISBN-002");

        // Remove Old Books Here
        System.out.println("\n--- Remove Old Books (> 5 years) ---");
        inventory.removeOldBooks(5);

        // Preview Final Inventory Here
        System.out.println("\n--- Final Inventory ---");
        inventory.printAllBooks();

        // Buy not Available Book Here
        System.out.println("\n--- Buying Not Available Book ---");
        bookstore.buyBook("noBook", 2, "you@example.com", "Cairo, Egypt");

        /************You are more than welcome to add a new book type by creating a new class!************/
![image](https://github.com/user-attachments/assets/2d5c7ae9-fc32-4bd7-9c75-7f0c0590954f)
