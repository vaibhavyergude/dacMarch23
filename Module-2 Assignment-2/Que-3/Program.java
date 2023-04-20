class Book {
    // fields
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;

    // methods

    // constructors

    // parameterless
    Book() {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.year = 0;
        this.price = 0;
        this.quantity = 0;
    }

    // parameterized
    Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // setter
    void setTitle(String title) {
        this.title = title;
    }

    void setauthor(String author) {
        this.author = author;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // getter
    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    String getPublisher() {
        return this.publisher;
    }

    String getIsbn() {
        return this.isbn;
    }

    int getYear() {
        return this.year;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

    // Business Logic

    // method to increase the quantity of the book in the inventory by the specified
    // amount
    void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    // method to decrease the quantity of the book in the inventory by the specified
    // amount
    void decreaseQuantity(int quantity) {
        this.quantity = this.quantity - quantity;
    }

    // method to calculate the total value of the
    // inventory of the book, which is the product of the price and the
    // quantity of the book
    double getInventoryValue() {
        return (price * (double) quantity);
    }

}

class Program {
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", "Penguin", "9783442178582", 2018, 422.00, 10);

        Book b2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "HarperCollins", "9780061952830", 1954, 29.99,
                100);

        System.out.println("b1 = " + b1.getQuantity());
        System.out.println("Inventory value = " + b1.getInventoryValue());
        b1.increaseQuantity(5);
        System.out.println("new b1 = " + b1.getQuantity());
        System.out.println("Inventory New value = " + b1.getInventoryValue());

        System.out.println("b2 = " + b2.getQuantity());
        System.out.println("Inventory value = " + b2.getInventoryValue());
        b2.decreaseQuantity(5);
        System.out.println("new b2 = " + b2.getQuantity());
        System.out.println("Inventory New value = " + b2.getInventoryValue());

    }
}
