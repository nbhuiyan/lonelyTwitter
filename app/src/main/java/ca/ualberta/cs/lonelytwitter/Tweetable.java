/*
 * Tweetable
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
 * Interface of Tweetable
 *
 * @author nazim
 * @version 1.0
 * @since 1.0
 *
 */

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
