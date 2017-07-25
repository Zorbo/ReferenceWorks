package abstractclass.gamecharacter;

/**
 * Created by Training on 2017. 05. 05..
 */
public final class Point2 {

    private long x;
    private long y;

    public Point2(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point2 point){

                  //distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        double z = Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
        return Math.round((long) z);

    }
}
