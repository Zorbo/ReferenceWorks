package collectionsclass;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Training on 2017. 04. 26..
 */
public class CollectionManager {

    private List<Book> library;

    public CollectionManager(List<Book> library) {

        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {

        List<Book> bookListUnmodi = Collections.unmodifiableList(library);

        return bookListUnmodi;
    }

    public List<Book> reverseLibrary() {

        Collections.reverse(library);
        return library;
    }

    public Book getFirstBook() {

        // Queue solution

        Queue<Book> libraryBooks = new LinkedList(library);
        return libraryBooks.peek();

        /* Iterator solution
        Iterator<Book> i = library.iterator();
        return i.next();
        */
    }

    public Book getLastBook() {

        // Queue solution
        Collections.reverse(library);
        Queue<Book> libraryBooks = new LinkedList<>(library);
        return libraryBooks.peek();

        /*  Iterator solution
         Collections.reverse(library);
         Iterator<Book> i = library.iterator();
         return i.next();
        */

    }
}
