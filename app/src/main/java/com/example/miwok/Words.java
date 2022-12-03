package com.example.miwok;

public class Words {

        private String mMiwok_translation;
        private String mDefault_translation;
        private int mImageResourceId = NO_IMAGE;
        private static final int NO_IMAGE = -1;
        private int mAudioResourceId;

        public Words( String default_translation , String miwok_translation, int audioResourceId){
            this.mMiwok_translation = miwok_translation;
            this.mDefault_translation = default_translation;
            this.mAudioResourceId = audioResourceId;
        }

    public Words( String default_translation , String miwok_translation , int imageResourceId, int audioResourceId){
        this.mMiwok_translation = miwok_translation;
        this.mDefault_translation = default_translation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }



        public String getMiwok_translation(){
            return mMiwok_translation;
        }

        public String getDefault_translation(){
            return mDefault_translation;
        }

        public int getImageResourceId(){ return mImageResourceId;}

        public boolean hasImage(){ return mImageResourceId != NO_IMAGE; }

        public int getAudioResourceId(){ return mAudioResourceId; }




}
