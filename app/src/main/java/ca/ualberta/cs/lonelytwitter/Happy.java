package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by naz_t on 9/14/2017.
 */

public class Happy extends CurrentMood {
    public Happy(Date date){
        String Mood = "Happy";
        setMood(Mood);
        setCurrentDate(date);
    }
    public Happy(){
        String Mood = "Happy";
        setMood(Mood);
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }
}
