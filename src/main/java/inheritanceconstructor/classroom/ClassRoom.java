package inheritanceconstructor.classroom;


/**
 * Created by Training on 2017. 03. 23..
 */
public class ClassRoom extends Room {

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }

    public boolean isSuitable(Course course) {
        if (course.getParticipants() <= this.getCapacity() && course.getFacilityNeeded() ==
                this.getFacility()) {
            return true;
        }
        return false;
    }
}
