package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by naz_t on 9/14/2017.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> MoodList;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate()

    public abstract Boolean isImportant();

    public void moodList(ArrayList<Mood> list){
        this.MoodList = list;
    }
}
