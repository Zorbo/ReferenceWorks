package gameshop_project_inprogress.presentation;

/**
 * Created by Training on 2017. 05. 10..
 */
public class Item {

    private String name;
    private int id;
    private String information;
    private int price;

    public Item(String name, int id, String information, int price) {
        this.name = name;
        this.id = id;
        this.information = information;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getInformation() {
        return information;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id == item.id && name.equals(item.getName())){
            return true;
        }
     return false;
    }

}
