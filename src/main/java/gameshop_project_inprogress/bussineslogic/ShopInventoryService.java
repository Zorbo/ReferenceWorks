package gameshop_project_inprogress.bussineslogic;

import gameshop_project_inprogress.persistence.ShopInventoryRepository;
import gameshop_project_inprogress.presentation.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Training on 2017. 05. 10..
 */

@Service
public class ShopInventoryService {

    private ShopInventoryRepository repo;

    @Autowired
    public ShopInventoryService(ShopInventoryRepository repo) {
        this.repo = repo;
    }

    public List<Item> listItems(int id){
        return repo.listItems(id);
    }

    public List<Item> listItems1(int id){
        return repo.listItems1(id);
    }

    public List<Item> listItems2(int id){
        return repo.listItems2(id);
    }

    public List<Item> listHeroItems(int id){
        return repo.listHeroItems(id);
    }
}
