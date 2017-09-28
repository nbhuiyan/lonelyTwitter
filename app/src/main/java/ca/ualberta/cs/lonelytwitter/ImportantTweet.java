/*
 * ImportantTweet
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
 * Represents an important tweet.
 *
 * @author nazim
 * @version 1.0
 * @since 1.0
 *
 */

public class ImportantTweet extends Tweet {
    /**
     * Constructor with just message. Date will set automatically.
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructor with both message and date
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date)
    {
        super(message, date);
    }

    /**
     * Check if tweet is important
     * @return bool
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
