package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9;
    private Button button_plus,button_minus,button_multi,button_div, button_modul;
    private Button button_AND, button_OR, button_XOR, button_NOT;
    private Button button_dot, button_clear, button_back, button_enter;

    private TextView t;
    private EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView)findViewById(R.id.textView2);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_0: t.setText("0"); break;
            case R.id.button_1: t.setText("1"); break;
            case R.id.button_2: t.setText("2"); break;
            case R.id.button_3: t.setText("3"); break;
            case R.id.button_4: t.setText("4"); break;
            case R.id.button_5: t.setText("5"); break;
            case R.id.button_6: t.setText("6"); break;
            case R.id.button_7: t.setText("7"); break;
            case R.id.button_8: t.setText("8"); break;
            case R.id.button_9: t.setText("9"); break;
            case R.id.button_plus:
            case R.id.button_minus:
            case R.id.button_multi:
            case R.id.button_modul:
            case R.id.button_div:
            case R.id.button_AND:
            case R.id.button_OR:
            case R.id.button_NOT:
            case R.id.button_XOR:
            case R.id.button_dot:
            case R.id.button_clear:
            case R.id.button_back:
            case R.id.button_enter:
        }
    }
}
