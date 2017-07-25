package abstractclass.gamecharacter;

import java.util.Random;

/**
 * Created by Training on 2017. 05. 05..
 */
public class Archer2 extends Character2 implements SpecialMoves {


    private int numberOfArrow;


    public Archer2(Point2 point2) {

        point2 = super.getPosition();
        this.numberOfArrow = 100;
    }

    private int getActualSecondaryDamage() {

        return new Random().nextInt(5) + 1;
    }


    private void shootingAnArrow(Character2 enemy){

        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character2 enemy) {
        shootingAnArrow(enemy);
    }

    @Override
    public void lastStand(Character2 heroes) {

    }

    @Override
    public void counterAttack(Character2 enemy) {

    }

    @Override
    public void powerOfOldGods(Character2 enemy) {

    }
}
