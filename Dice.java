package com.example.diceroller.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    //Dice Buttons
    private Button d4_button;
    private Button d6_button;
    private Button d8_button;
    private Button d10_button;
    private Button d12_button;
    private Button d20_button;

    //Number Buttons
    private Button clear_button;
    private Button zero_button;
    private Button one_button;
    private Button two_button;
    private Button three_button;
    private Button four_button;
    private Button five_button;
    private Button six_button;
    private Button seven_button;
    private Button eight_button;
    private Button nine_button;
    private Button roll_button;
    private Button percentile_button;

    //Text Views
    private TextView output_tv;
    private TextView outputTotal_tv;
    private TextView number_tv;
    private TextView dice_tv;

    private Dice chosenDice;
    private String chosenNum = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is how you access widgets on your interface

        //Assigning Dice Buttons
        this.d4_button = this.findViewById(R.id.d4_button);
        this.d6_button = this.findViewById(R.id.d6_button);
        this.d8_button = this.findViewById(R.id.d8_button);
        this.d10_button = this.findViewById(R.id.d10_button);
        this.d12_button = this.findViewById(R.id.d12_button);
        this.d20_button = this.findViewById(R.id.d20_button);

        //Assigning Number Buttons
        this.clear_button = this.findViewById(R.id.clear_button);
        this.zero_button = this.findViewById(R.id.zero_button);
        this.one_button = this.findViewById(R.id.one_button);
        this.two_button = this.findViewById(R.id.two_button);
        this.three_button = this.findViewById(R.id.three_button);
        this.four_button = this.findViewById(R.id.four_button);
        this.five_button = this.findViewById(R.id.five_button);
        this.six_button = this.findViewById(R.id.six_button);
        this.seven_button = this.findViewById(R.id.seven_button);
        this.eight_button = this.findViewById(R.id.eight_button);
        this.nine_button = this.findViewById(R.id.nine_button);
        this.roll_button = this.findViewById(R.id.roll_button);
        this.percentile_button = this.findViewById(R.id.percentile_button);

        //Assigning Text Views
        this.output_tv = this.findViewById(R.id.output_tv);
        this.outputTotal_tv = this.findViewById(R.id.outputTotal_tv);
        this.number_tv = this.findViewById(R.id.number_tv);
        this.dice_tv = this.findViewById(R.id.dice_tv);


    }
    public void onButtonClickedRoll(View v)
    {
        try
        {
            String outputString = "";
            int[] collectionOfRolls = chosenDice.roll(Integer.parseInt(chosenNum));
            for(int i =0; i < collectionOfRolls.length - 1; i++)
            {
                outputString += collectionOfRolls[i];
                outputString += " + ";
            }
            outputString += collectionOfRolls[collectionOfRolls.length -1];
            output_tv.setText(outputString);
            outputTotal_tv.setText(chosenDice.rollTotal(collectionOfRolls) + "");
        }
        catch(Exception e)
        {
            outputTotal_tv.setText("Try Again");
        }
    }

    public void onButtonClickedPercentile(View v)
    {
        Random r = new Random();
        this.outputTotal_tv.setText((r.nextInt(100 )+1) + "");
    }

    public void onButtonClickedDice(View v)
    {
        if(v == this.d4_button)
        {
            chosenDice = new Dice(4);
            this.dice_tv.setText("d4");
        }
        else if(v == this.d6_button)
        {
            chosenDice = new Dice(6);
            this.dice_tv.setText("d6");
        }
        else if( v == this.d8_button)
        {
            chosenDice = new Dice(8);
            this.dice_tv.setText("d8");
        }
        else if( v == this.d10_button)
        {
            chosenDice = new Dice(10);
            this.dice_tv.setText("d10");
        }
        else if( v == this.d12_button)
        {
            chosenDice = new Dice(12);
            this.dice_tv.setText("d12");
        }
        else if( v == this.d20_button)
        {
            chosenDice = new Dice(20);
            this.dice_tv.setText("d20");
        }
    }

    public void onButtonClickedNumbers(View v)
    {
        if(v == this.clear_button)
        {
            this.number_tv.setText("");
        }
        else if(v == this.zero_button)
        {
            this.chosenNum = chosenNum + 0;
            this.number_tv.setText(number_tv.getText() + "0");
        }
        else if( v == this.one_button)
        {
            this.chosenNum = chosenNum + 1;
            this.number_tv.setText(number_tv.getText() + "1");
        }
        else if( v == this.two_button)
        {
            this.chosenNum = chosenNum + 2;
            this.number_tv.setText(number_tv.getText() + "2");
        }
        else if( v == this.three_button)
        {
            this.chosenNum = chosenNum + 3;
            this.number_tv.setText(number_tv.getText() + "3");
        }
        else if( v == this.four_button)
        {
            this.chosenNum = chosenNum + 4;
            this.number_tv.setText(number_tv.getText() + "4");
        }
        else if(v == this.five_button)
        {
            this.chosenNum = chosenNum + 5;
            this.number_tv.setText(number_tv.getText() + "5");
        }
        else if( v == this.six_button)
        {
            this.chosenNum = chosenNum + 6;
            this.number_tv.setText(number_tv.getText() + "6");
        }
        else if( v == this.seven_button)
        {
            this.chosenNum = chosenNum + 7;
            this.number_tv.setText(number_tv.getText() + "7");
        }
        else if( v == this.eight_button)
        {
            this.chosenNum = chosenNum + 8;
            this.number_tv.setText(number_tv.getText() + "8");
        }
        else if( v == this.nine_button)
        {
            this.chosenNum = chosenNum + 9;
            this.number_tv.setText(number_tv.getText() + "9");
        }

    }




}
