package programing_algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Training on 2017. 06. 13..
 */
public class ProgramozasiAlap2 {

    //STUDY WITH LOTS OF COMMENTS!

    public static void main(String[] args) {
        int[] z = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 6, 10, 23, 45, 23, 55, 21, 32, 57,};
        ProgramozasiAlap2 pro = new ProgramozasiAlap2();
        System.out.println(pro.getOdd(13, z));
        System.out.println(pro.getEvenSum(10, z));
        System.out.println(pro.otherInteger(48, 122));


    }

    /*Olvass be pár számot (a darabszámot is kérje be a program), majd írd ki a
    páratlanok darabszámát.
    */
    public int getOdd(int x, int[] numbers) {
        int counter = 0;

        for (int i = 0; i <= x; i++) {
            if (numbers[i] % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public List otherInteger(int a, int b) {

        List<Integer> bop = new ArrayList<>();

        a = a + b;
        b = a - b;
        a = a - b;

        bop.add(a);
        bop.add(b);
        return bop;
    }

    /*
    Olvass be egy pár számot (a darabszámot is kérje be a program), majd írd ki a
    párosok összegét.
     */
    public int getEvenSum(int x, int[] z) {

        int sum = 0;
        for (int i = 0; i <= x; i++) {
            if (z[i] % 2 == 0) {
                sum += z[i];
            }
        }
        return sum;
    }


    /*
    Olvassunk be egész számokat egy tömbbe (a darabszámot is kérje be a program),
    majd kérjünk be egy egész számot. Keressük meg a tömbben az első ilyen egész
    számot, majd írjuk ki a tömbindexét. Ha a tömbben nincs ilyen szám, írjuk ki, hogy
    a beolvasott szám nincs a tömbben.
     */
}
