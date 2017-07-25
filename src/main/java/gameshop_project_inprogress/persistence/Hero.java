package gameshop_project_inprogress.persistence;

import gameshop_project_inprogress.presentation.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Training on 2017. 05. 10..
 */
public class Hero {

    private List<Item> inventory = new ArrayList<Item>();
    private int gold;


    public Hero(List<Item> inventory, int gold) {
        this.inventory = inventory;
        this.gold = gold;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getGold() {
        return gold;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
