import java.util.ArrayList;
public class User {
    private String user_name;
    private int user_id;
    private ArrayList<Book> borrowed_books = new ArrayList<>();

    public ArrayList<Book> getBorrowed_books() {
        return borrowed_books;
    }

    public User(String user_name,int user_id) {
        this.user_name = user_name;
        this.user_id = user_id;
    }
    public int getUser_id() {
        return user_id;
    }

    // This method for borrowing a book. The method takes a Book object and returns a boolean indicating if the book was successfully
    // borrowed. It first checks if the book is available to be borrowed using the isAvailable() method. If it is available,
    // the method sets its availability to false, adds it to a list of borrowed books and returns true. If the book is not available,
    // the method returns false to indicate that the book could not be borrowed.
    public boolean borrow_book(Book book){
        if(book.isAvailable()){
            book.setAvailable(false);
            borrowed_books.add((book));
            return true;
        }
        return false;
    }

    // This method for managing borrowed books that takes a Book object as an argument and returns a boolean value indicating whether the book was successfully returned or not.
    // It iterates through a list of borrowed books to check if the book being returned is in the list. If found, it sets its availability to true,
    // removes it from the list, and returns true. If not found, it returns false
    public boolean return_book(Book book){
        for(Book borrowed:borrowed_books){
            if(borrowed == book){
                book.setAvailable(true);
                borrowed_books.remove(book);
                return true;
            }
        }
        return false;
    }
}
