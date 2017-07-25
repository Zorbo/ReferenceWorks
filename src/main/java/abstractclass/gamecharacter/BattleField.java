package abstractclass.gamecharacter;

/**
 * Created by Training on 2017. 03. 24..
 */
public class BattleField {

    private int round;


    private boolean oneHit(Character attacker, Character defender){
        attacker.primaryAttack(defender);
        attacker.secondaryAttack(defender);
        if (attacker.getHitPoint() > 0 || defender.getHitPoint() > 0){
            return true;
        }
        return false;
    }

    public Character fight(Character one, Character other){

        while (oneHit(one, other)){
            round++;
            oneHit(other, one);
            round++;
            }
            if(one.isAlive()){
            return one;
        }
        return other;
    }


    public int getRound() {
        return round;
    }
}
