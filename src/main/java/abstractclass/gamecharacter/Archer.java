package abstractclass.gamecharacter;

import java.util.Random;

/**
 * Created by Training on 2017. 03. 24..
 */
public class Archer extends Character {

    int numberOfArrow;

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);

    }

    public Archer(Point position,  Random random) {
        super(position, random);
        this.numberOfArrow = 100;

    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage(){
        return getRandom().nextInt(5);

    }

    private void shootingAnArrow(Character enemy){
         numberOfArrow --;
        hit(enemy, getActualSecondaryDamage());
    }


}
