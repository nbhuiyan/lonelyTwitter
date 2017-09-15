package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by naz_t on 9/14/2017.
 */

public class Happy extends Mood {
    public Happy(Date date){
        setCurrentDate(date);
    }
    public Happy(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    @Override
    public String whatMood() {
        String mood = "Happy";
        return mood;
    }
}