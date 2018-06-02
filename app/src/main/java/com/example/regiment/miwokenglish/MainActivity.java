package com.example.regiment.miwokenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers_view);
        TextView familyMembers = (TextView) findViewById(R.id.family_members_view);
        TextView colors = (TextView) findViewById(R.id.colors_view);
        TextView phrases = (TextView) findViewById(R.id.phrases_view);

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext() ,
                        "open list of numbers", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);

            }
        });

        familyMembers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext() ,
                        "open list of family members", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(i);

            }
        });

        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext() ,
                        "open list of colors", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);

            }
        });

        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext() ,
                        "open list of phrases", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);

            }
        });

    }


}
