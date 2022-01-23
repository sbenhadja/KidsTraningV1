package com.kidstraning;


public class LingThing {

    private int mImageOfThingId;

    private String mLettersName;

    private int mSong;

    private int mThingColor;

    private String mThingName;

    private int mletterImage;

    public LingThing(int paramInt1, String paramString, int paramInt2, int paramInt3) {
        this.mletterImage = paramInt1;
        this.mThingName = paramString;
        this.mImageOfThingId = paramInt2;
        this.mSong = paramInt3;
    }

    public LingThing(String paramString, int paramInt1, int paramInt2) {
        this.mThingName = paramString;
        this.mImageOfThingId = paramInt1;
        this.mSong = paramInt2;
    }

    public LingThing(String paramString, int paramInt1, int paramInt2, int paramInt3) {
        this.mThingName = paramString;
        this.mImageOfThingId = paramInt1;
        this.mSong = paramInt2;
        this.mThingColor = paramInt3;
    }

    public LingThing(String paramString1, String paramString2, int paramInt1, int paramInt2) {
        this.mLettersName = paramString1;
        this.mThingName = paramString2;
        this.mImageOfThingId = paramInt1;
        this.mSong = paramInt2;
    }

    public int getImageOfThingId() { return this.mImageOfThingId; }

    public int getLetterImage() { return this.mletterImage; }

    public String getLettersName() { return this.mLettersName; }

    public int getSong() { return this.mSong; }

    public int getThingColor() { return this.mThingColor; }

    public String getThingName() { return this.mThingName; }
}
