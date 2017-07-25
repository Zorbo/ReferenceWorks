package moneychange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Training on 2017. 05. 17..
 */
public enum Banknote {

    HUF(20000,10000,5000,2000,1000,500,200,100,50,20,10,5),  //HUF és az USD is egy objektum, zárójelben(konstruktorban) a paraméter értékek
    USD(100,200,300,1000);  // Az enum értéke mindig egy objektum FELSOROLÁSOS típusuak

    private List<Integer> price;

    Banknote(Integer...prices) { //Változó méret miatt kell varargs!

        this.price = new ArrayList<>(Arrays.asList(prices));
        Collections.sort(price);
        Collections.reverse(price);
    }

    public List<Integer> getBankNotes() {
        return price;
    }


}
