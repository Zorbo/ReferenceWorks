package moneychange;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Training on 2017. 05. 17..
 */


public class ChangeLogicTest {

    @Test
    public void testChange(){

        List<Integer> change = new ArrayList<>();
        change.add(20000);
        change.add(10000);
        change.add(5000);
        change.add(2000);
        change.add(1000);
        change.add(500);
        change.add(200);
        change.add(100);
        change.add(50);
        change.add(20);
        change.add(10);
        change.add(5);

        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(20000, 2);
        testMap.put(5, 1);


        ChangeLogic changeLogic = new ChangeLogic();
        changeLogic.changeMoney(change, 40005);
        assertThat(changeLogic.changeMoney(change, 40005), equalTo(testMap));
    }

    @Test
    public void testChangeOtherPrice(){

        List<Integer> change = new ArrayList<>();
        change.add(20000);
        change.add(10000);
        change.add(5000);
        change.add(2000);
        change.add(1000);
        change.add(500);
        change.add(200);
        change.add(100);
        change.add(50);
        change.add(20);
        change.add(10);
        change.add(5);

        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(200, 1);
        testMap.put(100, 1);
        testMap.put(50, 1);
        testMap.put(20, 2);
        testMap.put(5, 1);

        ChangeLogic changeLogic = new ChangeLogic();
        changeLogic.changeMoney(change, 395);
        assertThat(changeLogic.changeMoney(change, 395), equalTo(testMap));
    }

    @Test
    public void testChange1(){

        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(20000, 2);
        testMap.put(5, 1);


        ChangeLogic changeLogic = new ChangeLogic();
        changeLogic.changeMoney(Banknote.HUF, 40005); //mindegy hogy milyen enum értéket írunk be látni fogja a többit is
        assertThat(changeLogic.changeMoney(Banknote.HUF, 40005), equalTo(testMap));
    }

    @Test
    public void testChangeOtherPrice2(){

        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(200, 1);
        testMap.put(100, 1);
        testMap.put(50, 1);
        testMap.put(20, 2);
        testMap.put(5, 1);

        ChangeLogic changeLogic = new ChangeLogic();
        changeLogic.changeMoney(Banknote.HUF, 395);  //mindegy hogy milyen enum értéket írunk be látni fogja a többit is
        assertThat(changeLogic.changeMoney(Banknote.HUF, 395), equalTo(testMap));
    }

    @Test
    public void testChangeUSD(){

        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(1000, 1);
        testMap.put(300, 2);
        testMap.put(100, 1);

        ChangeLogic changeLogic = new ChangeLogic();
        changeLogic.changeMoney(Banknote.USD, 1700);  //mindegy hogy milyen enum értéket írunk be látni fogja a többit is
        assertThat(changeLogic.changeMoney(Banknote.USD, 1700), equalTo(testMap));
    }

}
