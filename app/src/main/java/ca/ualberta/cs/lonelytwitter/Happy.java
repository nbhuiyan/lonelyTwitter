/*
 * Happy
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 nbhuiyan, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta
 * You can find a copy of the license in this project. Otherwise, please contact nazimudd@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents the Happy mood, extended from Abstract Class Mood
 *
 * @author nazim
 * @version 1.0
 * @since 1.0
 *
 */

public class Happy extends Mood {
    /**
     * Happy mood constructor with custom date
     * @param date
     */
    public Happy(Date date){
        setCurrentDate(date);
    }

    /**
     * Happy mood constructor with default date
     */
    public Happy(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    /**
     * Query what mood it is
     * @return String
     */
    @Override
    public String whatMood() {
        String mood = "Happy";
        return mood;
    }
}