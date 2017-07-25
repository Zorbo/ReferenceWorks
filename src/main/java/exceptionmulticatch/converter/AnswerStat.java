package exceptionmulticatch.converter;

/**
 * Created by Training on 2017. 03. 30..
 */
public class AnswerStat extends BinaryStringConverter {


    public AnswerStat(BinaryStringConverter binaryStringConverter) {

    }

    public boolean[] convert(String convert){
        try {
            super.binaryStringToBooleanArray(convert);
        } catch ( IllegalArgumentException | NullPointerException n) {
            throw new InvalidBinaryStringException("Convert error: " + convert, n);
        }
        return super.binaryStringToBooleanArray(convert);
    }

    int answerTruePercent(String answers){
        int trueCount = 0;



        boolean[] trueArray = super.binaryStringToBooleanArray(answers);
        for (int i = 0; i < trueArray.length; i++ ){
            if (trueArray[i]){
                trueCount++;
            }
        }
        return (int) Math.round(((double) trueCount / trueArray.length) * 100);
    }
}
