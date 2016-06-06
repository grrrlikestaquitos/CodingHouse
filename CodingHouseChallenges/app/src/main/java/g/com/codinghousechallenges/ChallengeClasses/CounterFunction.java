package g.com.codinghousechallenges.ChallengeClasses;

/**
 * Created by Andrei on 5/16/16.
 */
public class CounterFunction {

    private String mStr;
    private int numOfWords;
    private int containsLetters;
    private int containsSpace;
    private int numOfChars;
    private int aveLength;
  /* There should be 6-7 methods,
  A method that prints out the results as an object
  A method that takes in the String and returns it for the other methods.
  A method for the number of words in a String
  A method for the number of letters in the String
  A method for the number of spaces in the String
  A method for the total number of Characters in the String
  A method for the calculation for the average word length in the String */

    public CounterFunction(String str) {
        //Constructor
        mStr = str;
        numOfWords = 0;
        containsLetters = 0;
        containsSpace = 0;
        numOfChars = 0;
    }

    private String returnString() {
        return(mStr);
    }

    private void numOfWordsLetterSpaceMethod(String str) {
        numOfWords = str.split(" ").length;
        numOfChars = str.toCharArray().length;

        for(char x: str.toCharArray()) {
            if(Character.isLetter(x)) {
                containsLetters++;
            }
            if(x == ' ') {
                containsSpace++;
            }
        }
    }

    private int calcAveLen() {
        int lengthOfWord = 0;
        for(String x: mStr.split(" ")) {
            lengthOfWord += x.toCharArray().length;
        }
        return(lengthOfWord/numOfWords);
    }

    public void play() {
        numOfWordsLetterSpaceMethod(returnString());
        aveLength += calcAveLen();

    }

    public String getNumW() {
        String g = Integer.toString(numOfWords);
        return(g);
    }
    public String getNumL() {
        String g = Integer.toString(containsLetters);
        return(g);
    }
    public String getNumSpace() {
        String g = Integer.toString(containsSpace);
        return(g);
    }
    public String getNumChar() {
        String g = Integer.toString(numOfChars);
        return(g);
    }
    public String aveLen() {
        String g = Integer.toString(aveLength);
        return(g);
    }
}
