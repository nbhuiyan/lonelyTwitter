package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by nazim on 11/10/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        assertTrue(Boolean.FALSE);
    }
    public void testDelete(){
        assertTrue(Boolean.FALSE);
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet - new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.contains(tweet));
    }
}