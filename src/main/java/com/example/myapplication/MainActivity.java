package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Author: Tubino, John Patrick M.
// Date: January 29, 2026
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ;
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        String[] words = {
                "If you win, you live. If you lose, you die. If you don't fight, you can't win!",
                "Hindi na baleng malaki ang tiyan di naman bata ang laman",
                "Never regret anything that made you smile.",
                "Hustle until your haters ask if you’re hiring",
                "I like my money where I can see it: hanging in my closet",
                "Before you marry a person, you should first make them use a computer with slow internet to see who they really are.",
                "My favorite thing to do on this planet is to play games.",
                "Life is short. Smile while you still have teeth!",
                "I’m sick of following my dreams.",
                "The elevator to success is out of order.",
                "The difference between stupidity and genius is that genius has its limits"
        };
        TextView trivia1 = v.getRootView().findViewById(R.id.trivia1);
        Integer index = (Integer) v.getTag();

        if (index == null) {
            index = 0;
        }

        if (index < words.length) {
            trivia1.setText(words[index]);
            v.setTag(index + 1);

            if (index + 1 >= words.length) {
                v.setEnabled(false);
            }
        }
    }
}