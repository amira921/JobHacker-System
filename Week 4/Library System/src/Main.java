public class Main {
    public static void main(String[] args) {
        Library library = new Library("FCIH Library", 12345);

        // add a new books to the library
        library.addBook(new Book("Harry Potter", "J.K. Rowling", 1, 1.1));
        library.addBook(new Book("Anne of Green Gables", "Lucy Maud Montgomery", 2, 2.2));
        library.addBook(new Book("Anne of Avonlea", "Lucy Maud Montgomery", 3, 1.1));
        library.addBook(new Book("Anne of the Island", "Lucy Maud Montgomery", 4, 2.2));

        // remove a book from the library
        library.removeBook(2);

        User user1 = new User("Amira", 1);
        library.addUser(user1);

        User user2 = new User("Nada", 2);
        library.addUser(user2);

        User user3 = new User("Ali", 3);
        library.addUser(user3);

        // check out a book
        library.checkoutBook(1 , 3);
        library.checkoutBook(1 , 4);
        //library.checkoutBook(2 , 3);
        library.checkoutBook(3 , 1);

        // return a book
        library.returnBook(1 , 3);

        // display the list of available books
        library.showAvailableBooks();

        // display the book details of a specific book
        library.showBookDetails(3);

        // display the list of borrowed books
        library.showBorrowedBooks(1);
        //library.showBorrowedBooks(2);
        library.showBorrowedBooks(3);

    }
}