package abstractclass.gamecharacter;

import java.util.Random;

/**
 * Created by Training on 2017. 05. 05..
 */
public class Character2 {

    private Point2 position;
    private int hitPoint;


    public boolean isAlive() {

        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {

         return new Random().nextInt(10) + 1;
    }

    private int getActualDefence() {
        return new Random().nextInt(5);
    }

    private void decreaseHitPoint(int diff) {

        hitPoint =- diff;

    }

    protected void hit(Character2 enemy, int damage) {

        if (getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character2 enemy) {

        hit(enemy, getActualPrimaryDamage());
    }

    public Point2 getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }
}
