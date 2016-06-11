package g.com.codinghousechallenges.ChallengeClasses;

/**
 * Created by Andrei on 5/16/16.
 */
public class ReverseWordInPlace {

    private String result;

    public ReverseWordInPlace() {
        result = "";
    }

    public String reverseString(String str) {
        for(int i = (str.length() -1); i > -1; i--) {
            result += str.charAt(i);
        }
        return(result);
    }

}
