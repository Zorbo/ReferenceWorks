package collectionsclass;

/**
 * Created by Training on 2017. 04. 26..
 */
public class Book implements Comparable<Book> {


    private int id;
    private String author;
    private String title;


    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        if (Integer.compare(id, o.id) < 0){
            return -1;
        } if (Integer.compare(id, o.id) == 0){
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
