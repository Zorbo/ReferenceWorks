package activity;

import java.util.ArrayList;
import java.util.List;


public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();


    public Track() {
    }

    public void addTrackPoint(TrackPoint trackPoint) {

        trackPoints.add(trackPoint);
    }


        public Coordinate findMaximumCoordinate(){

            double maximumLatitude = 0; // Double.MIN_VALUE;  Ez a helyes
            double maximumLongitude = 0; // Double.MIN_VALUE;

            for (int i = 0; i < trackPoints.size(); i++) {

                if (trackPoints.get(i).getCoordinate().getLatitude() > maximumLatitude) {
                    maximumLatitude = trackPoints.get(i).getCoordinate().getLatitude();
                }
                if (trackPoints.get(i).getCoordinate().getLongitude() > maximumLongitude){
                    maximumLongitude = trackPoints.get(i).getCoordinate().getLongitude();
                }
            }

            return new Coordinate(maximumLatitude, maximumLongitude);

        }

    public Coordinate findMinimumCoordinate() {

        double minimumLatitude = 0; // Double.MAX_VALUE;  ez a helyes értékadás
        double minimumLongitude = 0; //  Double.MAX_VALUE;


        for (int i = 0; i < trackPoints.size(); i++) {

            if (trackPoints.get(i).getCoordinate().getLatitude() < minimumLatitude) {
                minimumLatitude = trackPoints.get(i).getCoordinate().getLatitude();
            }
                if (trackPoints.get(i).getCoordinate().getLongitude() < minimumLongitude){
                    minimumLongitude = trackPoints.get(i).getCoordinate().getLongitude();
                }
            }

        return new Coordinate(minimumLatitude, minimumLongitude);
    }

    public double getDistance() {

        double distanceSum = 0;

        for (int i = 1; i < trackPoints.size(); i++) {
            distanceSum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return distanceSum;
    }

    public double getFullDecrease() {

        double decreaseSum = 0;

        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i - 1).getElevation()) {
                decreaseSum += trackPoints.get(i).getElevation() + trackPoints.get(i - 1).getElevation();
            }
        }
        return decreaseSum;


    }

    public double getFullElevation() {

        double elevationSum = 0;

        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i - 1).getElevation()) {
                elevationSum += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }
        return elevationSum;
    }


        public double getRectangleArea(){

            double longitude = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();
            double latitude = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();

            return longitude * latitude;
            }



    public List<TrackPoint> getTrackPoints() {

        List<TrackPoint> trackPointList = new ArrayList<>();

        for (TrackPoint trackPoint : trackPoints) {
            trackPointList.add(trackPoint);
        }
        return trackPointList;
    }
}
