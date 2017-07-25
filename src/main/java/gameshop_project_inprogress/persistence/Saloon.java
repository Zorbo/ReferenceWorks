package gameshop_project_inprogress.persistence;

import gameshop_project_inprogress.presentation.Item;

/**
 * Created by Training on 2017. 05. 10..
 */
public class Saloon extends Shop {

    private int saloonGold = 3000;

    public Saloon(int saloonGold) {
        this.saloonGold = saloonGold;
    }

    @Override
    public void sellItems(Item item, Hero hero) {

    }

    @Override
    public void buyItems(Item item, Hero hero) {

    }
}
