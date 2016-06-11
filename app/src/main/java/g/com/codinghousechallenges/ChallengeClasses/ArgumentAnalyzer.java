package g.com.codinghousechallenges.ChallengeClasses;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrei on 5/16/16.
 */
public class ArgumentAnalyzer {

    private int mOdds;
    private int mNegatives;
    private int mAverage;
    private int mMedian;

    public ArgumentAnalyzer() {
        //Default Constructor
        mOdds = 0;
        mNegatives = 0;
        mAverage = 0;
        mMedian = 0;
    }

    public void arrayAnalyzer(List<Integer> x) {
        checkOddity(x);
        checkNegatives(x);
        calAveg(x);
        calMedian(x);
    }

    private void checkOddity(List<Integer> i) {
        for(int x: i) {
            if((x%2) == 1) {
                mOdds++;
            }
        }
    }

    private void checkNegatives(List<Integer> i) {
        for(int x: i) {
            if(x < 0) {
                mNegatives++;
            }
        }
    }

    private int calAveg(List<Integer> i) {
        for(int x: i) {
            mAverage+=x;
        }
        return(mAverage/i.size());

    }

    private int calMedian(List<Integer> i) {
        Collections.sort(i);
        int sorting = ((i.size())/2);
        if((sorting%2) == 0) {
            mMedian = (i.get(sorting));
        }
        if((sorting%2) == 1) {
            mMedian = (((i.get(sorting) + (i.get(sorting) - 1) / 2)));
        }
        return(mMedian);
    }

    public String getOddNum() {
        String oddNum = Integer.toString(mOdds);
        return(oddNum);
    }
    public String getNegNum() {
        String negNum = Integer.toString(mNegatives);
        return(negNum);
    }
    public String getAveNum() {
        String avNum = Integer.toString(mAverage);
        return(avNum);
    }
    public String getMedNum() {
        String medNum = Integer.toString(mMedian);
        return(medNum);
    }



    }

