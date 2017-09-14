package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by naz_t on 9/14/2017.
 */

public class Sad extends CurrentMood{
    public Sad(Date date){
        String Mood = "Sad";
        setMood(Mood);
        setCurrentDate(date);
    }
    public Sad(){
        String Mood = "Sad";
        setMood(Mood);
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }
}
