package programing_algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Training on 2017. 05. 22..
 */
public class ProgramozasiAlap {

    //STUDY WITH LOTS OF COMMENTS!

    private final int[] prims = {2, 3, 5, 7, 11, 13, 17, 19, 23};

    public static void main(String[] args) {
        ProgramozasiAlap pro = new ProgramozasiAlap();
        System.out.println(pro.result(100, 4));
        System.out.println(pro.giveBackNumber(23, 16));
        System.out.println(pro.getNumbers(10));
        System.out.println(pro.getNumbersNewLine(10));
        System.out.println(pro.getNumberDivisible(10));
        System.out.println(pro.getNumberDivisibleSum(10));
        System.out.println(pro.dividedByTwo(120));
        System.out.println(pro.countChars("aarrrccccqhhhhhh"));
        System.out.println(pro.isPrim(8));
        System.out.println(pro.returnPrims(24));
        System.out.println(pro.giveBackNumberSimple(8, 4));
        System.out.println(pro.isApple("alma"));
        System.out.println(pro.substractionThree(14));

    }

    public String result(int x, int y) {

        int i = 0;
        while (x >= y) {
            x = x - y;
            i++;
        }

        return "" + i + "*" + y + "+" + x;
    }

    //Írj programot, ami beolvas két számot, és kiírja a legkisebb közös többszörösüket!

    public int giveBackNumber(int x, int y) {
        int[] numOne = primitives(x);
        int[] numTwo = primitives(y);

        int result = 1;

        for (int i = 0; i < numOne.length; i++) {
            if (numOne[i] > numTwo[i]) {
                result *= (int) Math.pow(prims[i], numOne[i]);
            } else {
                result *= (int) Math.pow(prims[i], numTwo[i]);
            }
        }
        return result;
    }

    private int[] primitives(int x) {

        int[] multiples = new int[9];
        for (int i = 0; i < prims.length; i++) {
            while (x % prims[i] == 0) {
                x = x / prims[i];
                multiples[i]++;
            }
            if (x == 1) {
                break;
            }
        }
        return multiples;
    }

    // Ciklusban felfele haladni

    public int giveBackNumberSimple(int x, int y) {

        int z = x < y ? y : x;

        for (int i = z; i < Integer.MAX_VALUE; i++) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        throw new IllegalArgumentException("Boop");
    }

    //15. Írj programot, mely beolvas egy pozitív egész számot, és kiírja az egész számokat a
    //képernyőre eddig a számig, egymástól szóközzel elválasztva!
    public String getNumbers(int x) {

        StringBuilder numbers = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            if (i != x) {
                numbers.append(i).append(" ");
            } else {
                numbers.append(i);
            }
        }
        return numbers.toString();
    }

    //16. Írj programot, mely beolvas egy pozitív egész számot, és kiírja az egész számokat
    //egymás alá a képernyőre eddig a számig!
    public String getNumbersNewLine(int x) {

        StringBuilder numbers = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            if (i != x) {
                numbers.append(i).append("\n");
            } else {
                numbers.append(i);
            }
        }
        return numbers.toString();
    }

    //17. Írj programot, mely beolvas egy pozitív egész számot, és kiírja az osztóit!
    public String getNumberDivisible(int x) {

        StringBuilder divided = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divided.append(i).append(" ");
            }
        }
        return divided.toString();
    }

    //18. Írj programot, mely beolvas egy pozitív egész számot, és kiírja az osztóinak az
    //összegét!
    public int getNumberDivisibleSum(int x) {

        int sum = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

   /* 23. Írj programot, amely beolvas egy egész számot, majd elosztja 2-vel annyiszor,
    ahányszor lehet és közben felírja a számot a kettes számok szorzataként
    megszorozva egy olyan számmal, amely már nem osztható 2-vel. */

    public String dividedByTwo(int x) {

        StringBuilder numbers = new StringBuilder();
        numbers.append(x).append(" = ");

        while (x % 2 == 0) {
            x = x / 2;
            numbers.append(2).append("*");
        }
        numbers.append(x);

        return numbers.toString();
    }

    //Számold meg hogy hány betű van egy adott szövegben

    public String countChars(String x) {

        Map<Character, Integer> count = new HashMap<>();

        for (char c : x.toCharArray()) {
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }
        return count.toString();
    }

    //(m) Írj programot, mely eldönti egy számról, hogy prímszám-e

    public boolean isPrim(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
        //143 nem jó (11x13)
        //return x == 2 || x == 3 || x == 5 || x == 7 || !((x % 2 == 0) || (x % 3 == 0) || (x % 5 == 0) || (x % 7 == 0));
    }

    //(m) Írj programot, mely beolvas egy számot, és kiírja a prímszámokat eddig számig!

    public String returnPrims(int x) {

        List<Integer> st = new ArrayList<>();

        for (int i = 2; i <= x; i++) {
            if (isPrim(i)) {
                st.add(i);
            }
        }

        return st.toString();

        /*
        while (x % 2 == 1){
           x = x / 2;
           st.add(x);
        }
        return st.toString();*/
    }

    //(m) Írj programot, ami csak az "alma" szót hajlandó beolvasni, ha ez sikerült, akkor
    //kiírja, hogy az "Az alma gyümölcs!".

    public String isApple(String x) {

        StringBuilder st = new StringBuilder();

        if (x.equals("alma")) {
            st.append("Az").append(" ").append(x).append(" ").append("gyümölcs!");
        }
        return st.toString();
    }

    /*
    Írj programot, ami beolvas egy egész számot, majd addig von ki belőle 3-at, amíg
    háromnál kisebb nem lesz az eredmény. Írja ki ezek után a hárommal való
    maradékos osztását a számnak. Például:
    Kérek egy egész számot: 16
    16 = 5*3+1
    */

    public String substractionThree(int x) {

        StringBuilder st = new StringBuilder();
        st.append(x).append(" = ");

        if (x < 3) {
            throw new IllegalArgumentException("x must bigger that 3");
        }

        int counter = 0;
        while (x >= 3) {
            x = x - 3;
            counter++;
        }
        st.append(counter).append("*3+").append(x);

        return st.toString();
    }
}
