package com.example.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText text;
	private Model model;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText)findViewById(R.id.Row1_ShowInput);
        model = new Model();
        
        final Button[] num = new Button[16];
        final int[] ids = {R.id.button0,R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,
        		R.id.button6,R.id.button7,R.id.button8,R.id.button9,
        		R.id.buttonADD,R.id.buttonMINUS,R.id.buttonMULTIPLY,R.id.buttonDIVIDE,R.id.buttonClear,R.id.buttonEQUALS};
        

        for (int i = 0; i < num.length; i++) {
        	num[i] = (Button)findViewById(ids[i]);
        	num[i].setOnClickListener(new Controller(text, model));
        }

    }
   
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
