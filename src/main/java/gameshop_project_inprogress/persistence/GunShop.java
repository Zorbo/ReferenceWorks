package gameshop_project_inprogress.persistence;

import gameshop_project_inprogress.presentation.Item;

import java.util.List;

/**
 * Created by Training on 2017. 05. 10..
 */
public class GunShop extends Shop {

    private int gunGold = 3000;
    private List<Item> gunList;

    public GunShop(int gunGold) {
        this.gunGold = gunGold;
    }

    @Override
    public void sellItems(Item item, Hero hero) {  //Heroe-nak is kéne egy adatbázis

        if (hero.getGold() < item.getPrice()) {
            throw new IllegalArgumentException("You don't have enough gold Lad!");
        }

        for (Item i : gunList) {
            if (i.equals(item)) {
                hero.setGold(hero.getGold() - i.getPrice());
                gunGold += i.getPrice();
                gunList.remove(i);
                hero.getInventory().add(i);
            }
        }

    }

    @Override
    public void buyItems(Item item, Hero hero) {  //Itt az adatbázist updatelni kéne!

        if (gunGold < item.getPrice()) {
            throw new IllegalArgumentException("I don't have enough gold Cowboy!");
        }

        for (Item i : hero.getInventory()) {
            if (i.equals(item)) {
                hero.setGold(hero.getGold() + i.getPrice());
                gunGold -= i.getPrice();
                hero.getInventory().remove(i);
                gunList.add(i);
            }
        }

    }
}
