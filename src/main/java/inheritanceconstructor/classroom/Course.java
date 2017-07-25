package inheritanceconstructor.classroom;

/**
 * Created by Training on 2017. 03. 23..
 */
public class Course {

    private int participants;
    Facility facilityNeeded;

    public Course(int participants, Facility facilityNeeded) {
        this.participants = participants;
        this.facilityNeeded = facilityNeeded;
    }

    public int getParticipants() {
        return participants;
    }

    public Facility getFacilityNeeded() {
        return facilityNeeded;
    }


}
