package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

/**
 * Created by Training on 2017. 03. 26..
 */
public class PrintedFeatures implements Feature {

    private List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;


    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }


    public PrintedFeatures(String title , int numberOfPages, List<String> authors) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        } else {
            this.title = title;
        }
        if (numberOfPages < 0) {
            throw new IllegalArgumentException("numberOfPages is not a positive number");
        } else {
            this.numberOfPages = numberOfPages;
        }
        if (isEmpty(authors)) {
            throw new IllegalArgumentException("authors list is empty");
        } else {
            this.authors = authors;
        }
    }

    public List<String> getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
