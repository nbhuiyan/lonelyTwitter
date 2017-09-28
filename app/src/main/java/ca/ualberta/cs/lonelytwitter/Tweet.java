/*
 * Tweet
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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author nazim
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> MoodList;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message.
     * @param message tweet message
     * @throws TweetTooLongException when tweet length is more than 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * getter for date
     * @return date
     */

    public Date getDate() {
        return date;
    }

    /**
     * setter for date
     * @param date
     */
    public void setDate(Date date){ this.date = date;}

    /**
     * converts date to string and appends before message
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + "|" + message;
    }

    /**
     * query if tweet is important
     * @return boolean
     */
    public abstract Boolean isImportant();

    /**
     * get list of moods
     * @param list
     */
    public void moodList(ArrayList<Mood> list){
        this.MoodList = list;
    }
}
