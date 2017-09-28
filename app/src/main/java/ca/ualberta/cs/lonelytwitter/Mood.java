/*
 * Mood
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
 * Abstract class Mood
 *
 * @author nazim
 * @version 1.0
 * @since 1.0
 *
 */

public abstract class Mood {
    private Date CurrentDate;

    public Date getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(Date currentDate) {
        CurrentDate = currentDate;
    }

    public abstract String whatMood();
}