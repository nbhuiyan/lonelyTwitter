/*
 * NormalTweet
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
 * Created by naz_t on 9/14/2017.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
