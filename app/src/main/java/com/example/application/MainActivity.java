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

    public void onClick(View view)
    {
        Button button=(Button)view;
        String text= button.getText().toString();
        int val1=0,val2=0,result=0,c=0,s=0;
        if(text=="1"||text=="2"||text=="3"||text=="4"||text=="5"||text=="6"||text=="7"||text=="8"||text=="9"||text=="0")
        {
            screen.setText(String.valueOf(val1));
            if(s==0)
            val1=Integer.parseInt(text)*(10^c);

            else
                val2=Integer.parseInt(text)*(10^c);
            c++;
        }
        if(text=="+") {
            s = 1;
            c=0;
        }
        if(text=="-") {
            s = 2;
            c = 0;
        }
        if(text=="/") {
            s = 3;
            c = 0;
        }
        if(text=="*") {
            s = 4;
            c = 0;
        }
        if(text=="=")
        {
            switch(s)
            {
                case 1: result=val1+val2; break;
                case 2: result=val1-val2; break;
                case 3: result=val1/val2; break;
                case 4: result=val1*val2; break;

            }
            screen.setText(String.valueOf(result));
        }
        if(text=="C")
        {
            s=0;
            c=0;
            val1=0;
            val2=0;
            screen.setText("0");
        }
        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
