package abstractclass.gamecharacter;

import java.util.Random;

/**
 * Created by Training on 2017. 03. 24..
 */
public class AxeWarrior extends Character {

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }


    @Override
    public void secondaryAttack(Character enemy) {
        Point point = new Point(2,3);
        if (point.distance(getPosition()) < 2){
            hit(enemy, getActualSecondaryDamage());
        }

    }

    private int getActualSecondaryDamage(){

        return getRandom().nextInt(getActualSecondaryDamage() * 2);
    }
}
