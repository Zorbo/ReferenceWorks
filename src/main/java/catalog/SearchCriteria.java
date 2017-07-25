package catalog;

/**
 * Created by Training on 2017. 03. 26..
 */
public final class SearchCriteria {

    private String contributor;
    private String title;


    public static SearchCriteria createByBoth(String contributor, String title){

        if (Validators.isBlank(contributor) || Validators.isBlank(title)){
            throw new IllegalArgumentException("Invalid contributor");
        }
        return new SearchCriteria(title, contributor );

    }

    public static SearchCriteria createByContributor(String contributor){

        if (Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Invalid contributor");
        }
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title){

      if (Validators.isBlank(title)){
          throw new IllegalArgumentException("Invalid title");
      }

      return new SearchCriteria(null, title );
    }

    public boolean hasContributor(){
      return contributor != null;
    }

    public boolean hasTitle(){

     return title != null;
    }

    public SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {

        return title;
    }
}
