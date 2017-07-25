package exceptionmulticatch.converter;

/**
 * Created by Training on 2017. 03. 30..
 */
public class BinaryStringConverter {

    private int yes;


    public boolean[] binaryStringToBooleanArray(String stringList) {
        boolean[] answears;
        answears = new boolean[stringList.length()];

        for (int i = 0; i < stringList.length(); i++) {
            if (stringList.charAt(i) == '1') {
                answears[i] = true;
                this.yes++;

            } else if (stringList.charAt(i) == '0') {
                answears[i] = false;
            } else {
                throw new IllegalArgumentException("Not a boolean value");
            }

        }
        return answears;
    }

    public String booleanArrayToBinaryString(boolean[] booleanList) {
        if (booleanList.length == 0) {
            throw new IllegalArgumentException("Boolean list is empty");
        }
        String answers = "";

        for (int i = 0; i < booleanList.length; i++) {
            if (booleanList[i]) {
                answers += "1";
                this.yes++;
            } else {
                answers += "0";
            }
        }
        return answers;
    }

    public int getYes() {
        return yes;
    }
}
