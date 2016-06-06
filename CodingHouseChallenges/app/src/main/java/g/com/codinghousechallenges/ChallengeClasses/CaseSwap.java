package g.com.codinghousechallenges.ChallengeClasses;

/**
 * Created by Andrei on 5/16/16.
 */
public class CaseSwap {

    private String mStr;

    public CaseSwap(String str) {
        mStr = str;
    }

    public String reverseTest() {
        String i = " ";
        for(String x: mStr.split("")) {
            if(x == x.toUpperCase()) {
                String var = x.toLowerCase();
                i+= var;
            }
            if(x == x.toLowerCase()) {
                String var = x.toUpperCase();
                i+= var;
            }
        }
        return(i);
    }
}

