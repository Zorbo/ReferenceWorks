package catalog;

import java.util.List;

/**
 * Created by Training on 2017. 03. 26..
 */
public class Validators {

    public static boolean isBlank(String string){
        return  (string == null || string.trim().equals("") );
    }

    public static boolean isEmpty(List<String> strings){

        if (strings == null ||strings.size() == 0){
            return true;
        }
        return false;
    }
}
