package programing_algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Training on 2017. 05. 11..
 */
public class StudyMore {

    //STUDY WITH LOTS OF COMMENT!


    public boolean isEquals() {
        StudyMore stud = new StudyMore();
        StudyMore pud = new StudyMore();
        if (stud == pud) {
            return true;
        }
        return false;
    }


    public String reverse(String text) {

        String toLow = text.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = toLow.length() - 1; i >= 0; i--) {
            sb.append(toLow.charAt(i));
            if (i != 0) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

//    public String reverseVisoutVowels(String text) {
//
//        String toLow = text.toLowerCase();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = text.length() - 1; i >= 0; i--) {
//            sb.append(text.charAt(i));
//            if (i != 0) {
//                sb.append("-");
//            }
//        }
//        return sb.toString();
//    }

    public String removeVowels(String text) {
        String toLow = text.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";

        for (int i = 0; i < toLow.length(); i++) {
            char c = toLow.charAt(i);
            if (vowels.contains(Character.toString(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public int countStringInteger(String text) {

        String textToLow = text.toLowerCase();

        int sum = 0;
        for (int i = 0; i < textToLow.length(); i++) {
            char c = textToLow.charAt(i);
            if (isDigit(c)) {
                sum += getNumericValue(c);
            }
        }
        return sum;
    }

    public int getNumericValue(char c) {

        //String number = Character.toString(c);
        //return Integer.parseInt(number);

        return c - '0';  //48 mindegyikből kivonunk 48-at

    }

    public boolean isDigit(char c) {

        // String nubmers = "0123456789";
        // return nubmers.contains(Character.toString(c));

        return c >= '0' && c <= '9';
    }


    public String drawBrick(int x, int y, String letter) {
        if (x < 3 || y < 3) {
            throw new IllegalArgumentException("Parameters is to low");
        }
        if (letter.length() <= 0 || letter.length() > 1) {
            throw new IllegalArgumentException("Type one character!");
        }
        String brick = "";
        for (int i = 0; i < x; i++) {
            for (int z = 0; z < y; z++) {
                if (i == 0 || i == x - 1 || z == 0 || z == y - 1) {
                    brick += letter;
                } else {
                    brick += " ";
                }
            }
            brick += "\n";
        }
        return brick;
    }

    public String drawTriangle(int x) {

        String trilange = "";

        for (int i = x; i >= 0; i--) {
            for (int z = i; z < x; z++) {
                trilange += "*";
            }
            trilange += "\n";
        }
        return trilange;
    }


    public int sumArrayNumbers(int[] num) {

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] alice = {a0, a1, a2};
        int[] bob = {b0, b1, b2};
        int[] score = {0, 0};
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                score[0] += 1;
            } else if (alice[i] == bob[i]) {
                score[1] += 0;
            } else {
                score[1] += 1;
            }
        }
        return score;

    }

    public int find(int[] source, int item) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == item) {
                return i;
            }
        }
        return -1;
    }
/*
    public int[] insert(int[] source, int index, int item){

        int[] bop = new int[Integer.MAX_VALUE];

        for (int i = 0; i < source.length; i++){
            if (source[i] == item){


            }
        }
    }*/


    public static void main(String[] args) {

        List<String> popo = new ArrayList<>();

        int[] bop = {1, 5, 3, 4};

        System.out.println((int) '0');
        StudyMore mainr = new StudyMore();
        System.out.println(mainr.drawTriangle(5));
        System.out.println(mainr.drawBrick(5, 5, "*"));
        System.out.println(mainr.countStringInteger("A426zZ6kB8jh1002"));
        //    System.out.println(mainr.isEquals());
        System.out.println(mainr.reverse("reggel"));
        System.out.println(mainr.removeVowels("aamlegzeef"));
        System.out.println(mainr.reverse(mainr.removeVowels("aamlegzeef")));
        System.out.println(mainr.sumArrayNumbers(bop));
        System.out.println(mainr.find(bop, 3));


    }

}
