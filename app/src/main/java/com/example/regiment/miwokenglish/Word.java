package com.example.regiment.miwokenglish;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public static final int NO_IMAGE_INDICATOR = -1;
    private int mImageSourceId = NO_IMAGE_INDICATOR;

    public Word(String defaultTranslation, String miwokTranslation ,int imageSourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageSourceId = imageSourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public int getImageSourceId(){
        return mImageSourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public boolean hasImage(){
        return mImageSourceId != NO_IMAGE_INDICATOR;
    }

}
