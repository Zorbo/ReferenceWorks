package catalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Training on 2017. 03. 26..
 */
public class CatalogItem {

    private List<Feature> features = new ArrayList<>();
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.price = price;
        this.registrationNumber = registrationNumber;

        for (Feature oneFeature : features) {
            this.features.add(oneFeature);
        }
    }


    public int fullLengthAtOneItem() {
        int length = 0;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                length += ((AudioFeatures) feature).getLength();
            }
        }
        return length;
    }


    public List<String> getContributors() {
        List<String> contri = new ArrayList<>();
        for (Feature feature : features) {
            contri.addAll(feature.getContributors());
        }
        return contri;
    }


    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature : features) {
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public List<Feature> getFeatures() {
        return features;
    }


    public boolean hasAudioFeature() {

        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {

        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {

        int sumPages = 0;

        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                sumPages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return sumPages;
    }


    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

