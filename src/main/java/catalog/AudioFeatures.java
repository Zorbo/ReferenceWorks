package catalog;

import java.util.ArrayList;
import java.util.List;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

/**
 * Created by Training on 2017. 03. 26..
 */
public class AudioFeatures implements Feature {

    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {


        if (length < 0) {
            throw new IllegalArgumentException("Length is not a positive number");
        } else {
            this.length = length;
        }
        if (isEmpty(performers)) {
            throw new IllegalArgumentException("There are no performer");
        } else {
            this.performers = performers;
        }
        if (isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        } else {
            this.title = title;
        }
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer){


        if (length < 0) {
            throw new IllegalArgumentException("Length is not a positive number");
        } else {
            this.length = length;
        }
        if (isEmpty(performers)) {
            throw new IllegalArgumentException("There are no performer");
        } else {
            this.performers = performers;
        }
        if (isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        } else {
            this.title = title;
        }
        this.composer = composer;

    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();

        for (String composers : composer) {
            contributors.add(composers);
        }
        for (String performers : performers) {
            contributors.add(performers);
        }
        return contributors;
    }



    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }


}
