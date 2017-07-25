package catalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Training on 2017. 03. 26..
 */
public class Catalog {


    List<CatalogItem> catalogItems = new ArrayList<>();


    public Catalog() {
    }

    public void addItem(CatalogItem catalogItem) {

        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int pageNumber) {

        double pageSum = 0, pageCount = 0;

        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.numberOfPagesAtOneItem() > pageNumber) {
                pageSum += catalogItem.numberOfPagesAtOneItem();
                pageCount++;
            }
        }
        return pageSum / pageCount;
    }

    public void deleteItemByRegistrationNumber(String regNum) {

        CatalogItem remove = null;

        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(regNum)) {
                remove = catalogItem;
                break;
            }
        }
        catalogItems.remove(remove);

    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {

        List<CatalogItem> searchItems = new ArrayList<>();

        for (CatalogItem catalogItem : catalogItems) {

            for (String title : catalogItem.getTitles()) {
                if (title.equals(searchCriteria.getTitle())) {
                    searchItems.add(catalogItem);
                }
            }
            for (String contri : catalogItem.getContributors()) {
                if (contri.equals(searchCriteria.getContributor())) {
                    if (!searchItems.contains(catalogItem)){
                        searchItems.add(catalogItem);
                    }
                }
            }
        }
        return searchItems;
    }

    public int getAllPageNumber() {

        int pageNumbers = 0;

        for (CatalogItem catalogItem : catalogItems) {
            pageNumbers += catalogItem.numberOfPagesAtOneItem();
        }
        return pageNumbers;
    }

    public List<CatalogItem> getAudioLibraryItems() {

        List<CatalogItem> getAudioItems = new ArrayList<>();

        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                getAudioItems.add(catalogItem);
            }
        }
        return getAudioItems;
    }

    public int getFullLength() {

        int legth = 0;

        for (CatalogItem catalogItem : catalogItems) {
            legth += catalogItem.fullLengthAtOneItem();
        }
        return legth;
    }

    public List<CatalogItem> getPrintedLibraryItems() {

        List<CatalogItem> getPrintItems = new ArrayList<>();

        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                getPrintItems.add(catalogItem);
            }
        }
        return getPrintItems;
    }

}
