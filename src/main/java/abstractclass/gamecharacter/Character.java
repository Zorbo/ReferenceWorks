package abstractclass.gamecharacter;

import java.util.Random;

/**
 * Created by Training on 2017. 03. 24..
 */
public abstract class Character {

    private Point position;
    private int hitPoint;
    private Random random;



    public boolean isAlive(){
        if(hitPoint <= 0){
            return false;
        }
        return true;
    }

    protected int getActualPrimaryDamage(){

        int damage = random.nextInt(10);
         return damage;
    }

    private int getActualDefence(){
        int def = random.nextInt(5);
        return def;
    }

    protected void hit(Character enemy, int damage){

        if (getActualDefence() < damage){
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){

        hit(enemy, getActualPrimaryDamage());

    }

    private void decreaseHitPoint(int diff){
         if(isAlive()){
             hitPoint -= diff;
         }
    }

    abstract public void secondaryAttack(Character enemy);

    public Character(Point position, Random random) {
        this.position = position;
        this.hitPoint = 100;
        this.random = random;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }



}
