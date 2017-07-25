package inheritanceconstructor.classroom;

/**
 * Created by Training on 2017. 03. 23..
 */
public class Room {

    private String location;
    private int capacity;

    public Room(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }
}
