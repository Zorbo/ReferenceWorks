package gameshop_project_inprogress.persistence;

import gameshop_project_inprogress.presentation.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Training on 2017. 05. 10..
 */

@Repository
public class ShopInventoryRepository {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ShopInventoryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Item> listItems(int shopId){
        return jdbcTemplate.query("select item.id, item.price, item.name, item.info FROM item WHERE item.id" +
            " IN(SELECT shopInventory.itemID FROM shopInventory WHERE shopInventory.shopID =" + shopId + " )",
                new RowMapper<Item>() {
                    @Override
                    public Item mapRow(ResultSet resultSet, int i) throws SQLException {
                        int id = resultSet.getInt("item.id");
                        int price = resultSet.getInt("item.price");
                        String name = resultSet.getString("item.name");
                        String info = resultSet.getString("item.info");
                        Item item = new Item(name, id, info, price);
                        return item;
                    }
                }
        );
    }

    public List<Item> listItems1(int shopId){
        return jdbcTemplate.query("select item.id, item.price, item.name, item.info FROM item WHERE item.id" +
                        " IN(SELECT shopInventory.itemID FROM shopInventory WHERE shopInventory.shopID =" + shopId + " )",
                new RowMapper<Item>() {
                    @Override
                    public Item mapRow(ResultSet resultSet, int i) throws SQLException {
                        int id = resultSet.getInt("item.id");
                        int price = resultSet.getInt("item.price");
                        String name = resultSet.getString("item.name");
                        String info = resultSet.getString("item.info");
                        Item item = new Item(name, id, info, price);
                        return item;
                    }
                }
        );
    }

    public List<Item> listItems2(int shopId){
        return jdbcTemplate.query("select item.id, item.price, item.name, item.info FROM item WHERE item.id" +
                        " IN(SELECT shopInventory.itemID FROM shopInventory WHERE shopInventory.shopID =" + shopId + " )",
                new RowMapper<Item>() {
                    @Override
                    public Item mapRow(ResultSet resultSet, int i) throws SQLException {
                        int id = resultSet.getInt("item.id");
                        int price = resultSet.getInt("item.price");
                        String name = resultSet.getString("item.name");
                        String info = resultSet.getString("item.info");
                        Item item = new Item(name, id, info, price);
                        return item;
                    }
                }
        );
    }

    public List<Item> listHeroItems(int shopId){
        return jdbcTemplate.query("select item.id, item.price, item.name, item.info FROM item WHERE item.id" +
                        " IN(SELECT shopInventory.itemID FROM shopInventory WHERE shopInventory.shopID =" + shopId + " )",
                new RowMapper<Item>() {
                    @Override
                    public Item mapRow(ResultSet resultSet, int i) throws SQLException {
                        int id = resultSet.getInt("item.id");
                        int price = resultSet.getInt("item.price");
                        String name = resultSet.getString("item.name");
                        String info = resultSet.getString("item.info");
                        Item item = new Item(name, id, info, price);
                        return item;
                    }
                }
        );
    }
    // Original SQL
//    "select item.id, item.price, item.name, item.info FROM shop, item, shopInventory WHERE item.id" +
//            " IN(SELECT shopInventory.itemID FROM shopInventory WHERE shopInventory.shopID =" + shopId + " )"
}
