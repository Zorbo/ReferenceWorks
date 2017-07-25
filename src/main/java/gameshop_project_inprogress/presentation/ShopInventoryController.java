package gameshop_project_inprogress.presentation;

import gameshop_project_inprogress.bussineslogic.ShopInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Training on 2017. 05. 10..
 */
@RestController
public class ShopInventoryController {

    private ShopInventoryService service;

    @Autowired
    public ShopInventoryController(ShopInventoryService service) {
        this.service = service;
    }

    @RequestMapping("/medival")
    public List<Item> listItems(){
        return service.listItems(1);
    }

    @RequestMapping("/gunshop")
    public List<Item> listItems1(){
        return service.listItems1(2);
    }

    @RequestMapping("/saloon")
    public List<Item> listItems2(){
        return service.listItems2(3);
    }

    @RequestMapping("/hero")
    public List<Item> listHeroItems(){
        return service.listHeroItems(4);
    }
}
