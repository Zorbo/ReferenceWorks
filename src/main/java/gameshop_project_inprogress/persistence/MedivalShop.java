package gameshop_project_inprogress.persistence;

import gameshop_project_inprogress.presentation.Item;

/**
 * Created by Training on 2017. 05. 10..
 */
public class MedivalShop extends Shop {


    private int medivalGold = 3000;

    public MedivalShop(int medivalGold) {
        this.medivalGold = medivalGold;
    }

    @Override
    public void sellItems(Item item, Hero hero) {

    }

    @Override
    public void buyItems(Item item, Hero hero) {

    }
}
