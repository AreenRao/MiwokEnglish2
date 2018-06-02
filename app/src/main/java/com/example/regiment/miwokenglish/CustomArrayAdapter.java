package com.example.regiment.miwokenglish;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<Word> {


    public int backgroundColor;
    public CustomArrayAdapter(Activity context, ArrayList<Word> words, int backGroundColor){
        super(context, 0, words);
        backgroundColor = backGroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word word = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView defaultText = (TextView) listItemView.findViewById(R.id.text_english);
        defaultText.setText(word.getDefaultTranslation());

        TextView miwokText = (TextView) listItemView.findViewById(R.id.text_miwok);
        miwokText.setText(word.getMiwokTranslation());

        ImageView img = (ImageView) listItemView.findViewById(R.id.image_count);

        if(word.hasImage()){
            img.setImageResource(word.getImageSourceId());
        }else{
            img.setVisibility(View.GONE);
        }

        listItemView.findViewById(R.id.list_text_id).setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));

        return listItemView;
    }
}
