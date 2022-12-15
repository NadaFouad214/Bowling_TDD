import org.junit.Test;

public class Game {

    int []rolled=new int[22];
    private int currentBall;
    public void roll(int pins) {
        rolled[currentBall]=pins;
        currentBall++;
    }

    public int score() {
        int score=0;
        int thisBall=0;
        for(int i=0;i<20;i+=2)
        {

            if(rolled[thisBall]==10)
            {

                score+=10+rolled[thisBall+1]+rolled[thisBall+2];
                thisBall+=1;
            }
            //spare
           else if(rolled[thisBall]+rolled[thisBall+1]==10)
            {
                 score+=10+rolled[thisBall+2];
                 thisBall+=2;
            }
            else
            {
                score+=rolled[thisBall]+rolled[thisBall+1];
                thisBall+=2;
            }
        }
          return score;
    }


}
