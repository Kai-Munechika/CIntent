package com.kaim808.criminalintent;

import android.util.Log;

import java.util.Date;
import java.util.UUID;

/**
 * Created by KaiM on 4/23/17.
 */

public class Crime {

    private UUID mId;;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();    // we generate a random universally unique ID value
        Log.e("kaikai", "In Crime constructor: " + mId.toString());
        mDate = new Date(); // default constructor for Date() sets mDate to the current Date
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
