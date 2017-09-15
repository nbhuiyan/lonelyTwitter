package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by naz_t on 9/14/2017.
 */

public class Sad extends CurrentMood{
    public Sad(Date date){
        setCurrentDate(date);
    }
    public Sad(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    @Override
    public String whatMood() {
        String mood = "sad";
        return mood;
    }
}
