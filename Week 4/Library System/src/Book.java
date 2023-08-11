public class Book {
    private String book_title , author_name;
    private int book_id;
    private double book_version;
    private boolean isAvailable;

    public Book(String book_title,String author_name,int book_id,double book_version) {
        this.book_title = book_title;
        this.book_id = book_id;
        this.author_name = author_name;
        this.book_version = book_version;
        this.isAvailable = true;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public double getBook_version() {
        return book_version;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available){
        this.isAvailable = available;
    }
}
