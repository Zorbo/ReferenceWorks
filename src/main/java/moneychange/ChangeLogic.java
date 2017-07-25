package moneychange;

import java.util.*;

/**
 * Created by Training on 2017. 05. 17..
 */
public class ChangeLogic {


    public Map<Integer, Integer> changeMoney(List<Integer> notes, int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invaild amount: " + amount);
        }
        List<Integer> notesUse = new ArrayList<>(notes);
        Map<Integer, Integer> change = new HashMap<>();

        //Rendezni kell a címleteket
        Collections.sort(notesUse);
        //Itt a Húszezres lesz elől!
        Collections.reverse(notesUse);


        for (int i = 0; i < notesUse.size(); i++) {
            int currentValue = notesUse.get(i);
            while ((amount - currentValue) >= 0) {   //Addig vonja le az értékeket amíg egyenlő nem lesz nullával
                amount = amount - currentValue;
                change.put(currentValue, change.getOrDefault(currentValue, 0) + 1); //Megadhatjuk a map kulcsnak az értékét
            }
        }
        return change;
    }

    public Map<Integer, Integer> changeMoney(Banknote bankNotes, int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invaild amount: " + amount);
        }
        List<Integer> notesUse = new ArrayList<>(bankNotes.getBankNotes());
        Map<Integer, Integer> change = new HashMap<>();


        for (int i = 0; i < notesUse.size(); i++) {
            int currentValue = notesUse.get(i);
            while ((amount - currentValue) >= 0) {   //Addig vonja le az értékeket amíg egyenlő nem lesz nullával
                amount = amount - currentValue;
                change.put(currentValue, change.getOrDefault(currentValue, 0) + 1); //Megadhatjuk a map kulcsnak az értékét
            }
        }
        return change;
    }

}
