package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends Activity implements View.OnClickListener {
    TextView screen;
    MaterialButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonm,buttond,buttona,buttons,buttonc,buttone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = findViewById(R.id.screen);
        assignId(buttonc,R.id.buttonc);
        assignId(buttond,R.id.buttond);
        assignId(buttonm,R.id.buttonm);
        assignId(buttona,R.id.buttona);
        assignId(buttons,R.id.buttons);
        assignId(buttone,R.id.buttone);
        assignId(button0,R.id.button0);
        assignId(button1,R.id.button1);
        assignId(button2,R.id.button2);
        assignId(button3,R.id.button3);
        assignId(button4,R.id.button4);
        assignId(button5,R.id.button5);
        assignId(button6,R.id.button6);
        assignId(button7,R.id.button7);
        assignId(button8,R.id.button8);
        assignId(button9,R.id.button9);





    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);

    }
    int val1=0,val2=0,result=0,c=0,s=0;
    public void onClick(View view)
    {
        Button button=(Button)view;
        String text= button.getText().toString();

        if(text.equals("1")||text.equals("2")||text.equals("3")||text.equals("4")||text.equals("5")||text.equals("6")||text.equals("7")||text.equals("8")||text.equals("9")||text.equals("0"))
        {
            if(s==0) {
                val1 = (int) ((val1 * 10) + Integer.parseInt(text));
                screen.setText(String.valueOf(val1));
            }
            else {
                val2 = (int) ((val2 * 10) + Integer.parseInt(text));
                screen.setText(screen.getText().toString()+text);
            }
            c++;
        }
        else if(text.equals("+")) {
            screen.setText(screen.getText().toString()+"+");
            if(val2!=0) {
                val1 = calc(val1, val2, s);
                val2=0;
            }
            s = 1;
            c=0;
        }
        else if(text.equals("-")) {
            screen.setText(screen.getText().toString()+"-");
            if(val2!=0) {
                val1 = calc(val1, val2, s);
                val2=0;
            }
            s = 2;
            c = 0;
        }
        else if(text.equals("/")) {
            screen.setText(screen.getText().toString()+"/");
            if(val2!=0) {
                val1 = calc(val1, val2, s);
                val2=0;
            }
            s = 3;
            c = 0;
        }
        else if(text.equals("*")) {
            screen.setText(screen.getText().toString()+"*");
            if(val2!=0) {
                val1 = calc(val1, val2, s);
                val2=0;
            }
            s = 4;
            c = 0;
        }
        else if(text.equals("="))
        {
            result=calc(val1,val2,s);
            screen.setText(String.valueOf(result));
        }
        else if(text.equals("C"))
        {
            s=0;
            c=0;
            val1=0;
            val2=0;
            screen.setText("0");
        }
        }
        int calc(int val1,int val2,int s)
        {
            int result=0;
            switch(s)
            {
                case 1: result=val1+val2; break;
                case 2: result=val1-val2; break;
                case 3: result=val1/val2; break;
                case 4: result=val1*val2; break;

            }
            return(result);
        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
