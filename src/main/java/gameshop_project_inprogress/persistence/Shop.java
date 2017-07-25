package gameshop_project_inprogress.persistence;

import gameshop_project_inprogress.presentation.Item;

/**
 * Created by Training on 2017. 05. 10..
 */
public abstract class Shop {

    public abstract void sellItems(Item item, Hero hero);

    public abstract void buyItems(Item item, Hero hero);
}
