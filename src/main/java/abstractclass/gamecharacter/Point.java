package abstractclass.gamecharacter;

/**
 * Created by Training on 2017. 03. 24..
 */
public final class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point point){

        double z = Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
        return Math.round(z);
    }


}
