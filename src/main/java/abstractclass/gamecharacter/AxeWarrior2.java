package abstractclass.gamecharacter;

/**
 * Created by Training on 2017. 05. 05..
 */
public class AxeWarrior2 extends Character2 implements SpecialMoves {


    private int rage;
    private int rageMode;

    public AxeWarrior2(Point2 point2) {
        point2 = super.getPosition();
        rage = 0;
        rageMode = 0;
    }
    private int getActualSecondaryDamage() {


        return (getActualPrimaryDamage() * 2) + rage + rageMode;

    }
    @Override
    public void secondaryAttack(Character2 enemy) {

        if (enemy.getPosition().distance(this.getPosition())<= 2 ){
            hit(enemy,getActualSecondaryDamage());
            rage++;
        }

    }

    @Override
    public void lastStand(Character2 axeWarrior) {

        if (axeWarrior.getHitPoint() < 20){
            rageMode = getActualSecondaryDamage() * 2;
        } else {
            rageMode = 0;
        }


    }

    @Override
    public void counterAttack(Character2 enemy) {

    }

    @Override
    public void powerOfOldGods(Character2 enemy) {

    }


}
