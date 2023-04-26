import java.util.ArrayList;

public class Library {
    private String library_name;
    private int library_code;
    private ArrayList<Book> books = new ArrayList<>() ;
    private ArrayList<User> users = new ArrayList<>();

    public Library(String library_name,int library_code){
        this.library_name = library_name;
        this.library_code = library_code;
    }
    public void addUser(User user){
        users.add(user);
        System.out.println("User added successfully!");
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // This method removed a book from a collection of books by taking an integer parameter book_id.
    // The method iterates through the collection of books to find the book with the matching book_id,
    // removes it from the collection, and prints a success message. If the book_id is not found,
    // the method prints an error message and exits the program.
    public void removeBook(int book_id){
        for(Book book:books){
            if(book_id == book.getBook_id()){
                books.remove(book);
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("invalid book id!");
        System.exit(0);
    }

    // This method called checkoutBook, which takes two integer arguments: user_id and book_id.
    // The method iterates through the list of users to find the user with the specified user_id. It then checks
    // if the book with the specified book_id is available to be borrowed. If the book is available, it is borrowed by the user,
    // and a success message is printed to the console. If the book is not available, an error message is printed and the program exits
    public void checkoutBook(int user_id,int book_id){
        for(User u : users){
            if(user_id == u.getUser_id()) {
                for (Book book : books)
                    if (book_id == book.getBook_id() && book.isAvailable()) {
                        u.borrow_book(book);
                        System.out.println("Book checked out successfully!");
                        return;
                    }
               }
           }

        System.out.println("Book unavailable for check out!");
        System.exit(0);
    }

    // This method used to return a book borrowed by a user. It takes two parameters, user_id and book_id,
    // and searches through the collection of users to find the user with the matching user_id. It then searches through
    // the borrowed_books list of that user to find the book with the matching book_id. If the book is found,
    // the user's return_book() method is called to return the book and a success message is printed. If the book is not found,
    // a "Book not found!" message is printed and the program exits.
    public void returnBook(int user_id,int book_id){
        for(User u : users){
            if(user_id == u.getUser_id()){
                for(Book book: u.getBorrowed_books()){
                    if(book_id == book.getBook_id()){
                        u.return_book(book);
                        System.out.println("Book returned successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("Book not found!");
        System.exit(0);
    }
    // This method used to display a list of available books.
    // It iterates through a collection of Book objects, checks if each book is available by calling the isAvailable() method,
    // and prints the titles of available books to the console.
    public void showAvailableBooks(){
        System.out.println("Available Books:");
        for(Book book : books){
            if(book.isAvailable())
                System.out.print( "   " + book.getBook_title());
        }
        System.out.println();
    }

    // This method takes a userId as an argument and displays the list of books borrowed by the user with the given userId,
    // and then iterates over a list of users to find the user with the given userId. If the user is found and has borrowed books,
    // the method prints the list of borrowed books for that user. Otherwise, the method prints a message indicating that the user has no borrowed books.
    // If the user is not found in the list of users, the method prints a message indicating that the user was not found and exits the program.
    public void showBorrowedBooks(int userId){
        for(User u: users){
            if(userId == u.getUser_id()){
                if(u.getBorrowed_books().size() > 0) {
                    System.out.println("Borrowed Books of user with id = " + userId);
                    for (Book book : u.getBorrowed_books()) {
                        System.out.println(book.getBook_id() + " " + book.getBook_title() + '\n');
                    }
                } else {
                    System.out.println("No Borrowed Books!");
                }
                return;
            }
        }
        System.out.println("User not found!");
        System.exit(0);
    }

    // This method takes an integer book_id as an argument and displays the details of the corresponding book if it is found in the collection of books.
    // and then iterates through the list of books and checks if the book_id matches the id of any book in the list.
    // If a match is found, the details of the book (such as title, author, version, and availability) are printed to the console.
    //If the book is not found in the list, the message "Book not found!" is printed to the console, and the program exits.
    public void showBookDetails(int book_id){
        for(Book book : books){
            if(book_id == book.getBook_id()){
                System.out.println("Book Details:");
                System.out.println("Book Id: " + book.getBook_id() + "\nBook Title:" + book.getBook_title() +
                        "\nBook Author: " + book.getAuthor_name()
                        + "\nBook Version: " + book.getBook_version() + "\nBook Availability:" + book.isAvailable());
                return;
            }
        }
        System.out.println("Book not found!");
        System.exit(0);
    }
}
