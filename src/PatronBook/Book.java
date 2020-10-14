package PatronBook;

public class Book {
private String title;
private String author;
    public String getTitle(String title) {
        return title;
    }

    private Book(String a, String t) {
        author = a;
        title = t;
    }

    public String toString(String title, String author) {

        return title + " " + author + " ";
    }

}
