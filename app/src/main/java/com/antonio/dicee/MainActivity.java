package com.antonio.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollbutton);

        //Link the views in the layout xml file to the java code
        final ImageView leftDice =  findViewById(R.id.image_leftDice);

        final ImageView rightDice = findViewById(R.id.image_rightDice);

        //Store the dice images in an array (collection)
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        // Tell the button to listen for clicks
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee", "The button has been pressed");

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(6);


                // Print this random number to the logcat to see it in the Android Monitor
                Log.d("Dicee", "The random number is " + number);

                leftDice.setImageResource(diceArray[number]);

                int number2 = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number2]);
            }
        });

    }
}
