package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by naz_t on 9/14/2017.
 */

public abstract class CurrentMood {
    private Date CurrentDate;

    public Date getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(Date currentDate) {
        CurrentDate = currentDate;
    }

    public abstract String whatMood();
}