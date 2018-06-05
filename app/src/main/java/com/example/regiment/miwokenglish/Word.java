package com.example.regiment.miwokenglish;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public static final int NO_IMAGE_INDICATOR = -1;
    private int mImageSourceId = NO_IMAGE_INDICATOR;
    private int mAudio;

    public Word(String defaultTranslation, String miwokTranslation ,int imageSourceId, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageSourceId = imageSourceId;
        mAudio = audio;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
    }

    public int getAudio(){
        return mAudio;
    }

    public int getImageSourceId() { return mImageSourceId; }

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
