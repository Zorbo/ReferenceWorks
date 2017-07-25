package activity;

import java.util.ArrayList;
import java.util.List;


public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }


    public List<Report> distancesByTypes() {

        List<Report> reports = new ArrayList<>();
        double outer = 0;

        for (ActivityType activityType : ActivityType.values()) {
            for (Activity activity : activities) {
                if (activity.getType() == activityType) {
                    outer += activity.getDistance();
                }
            }
            reports.add(new Report(activityType, outer));
        }
        return reports;
    }

    public int numberOfTrackActivities() {

        int withTrackCount = 0;
        for (Activity activeTrack : activities) {
            if (activeTrack.getType() != ActivityType.BASKETBALL) {
                withTrackCount++;
            }
        }
        return withTrackCount;
    }


    public int numberOfWithoutTrackActivities() {

        int withoutTrackCount = 0;
        for (Activity activeTrack : activities) {
            if (activeTrack.getType() == ActivityType.BASKETBALL) {
                withoutTrackCount++;
            }
        }
        return withoutTrackCount;
    }


}
