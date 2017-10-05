package com.example.ankit.myclasslab;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

public class Ex7_1 extends Activity {
	
    private SharedPreferences prefs;
    private String prefName = "BTech";
    private EditText editText;
    private SeekBar seekBar;
    private Button btn;
    
    private static final String FONT_SIZE_KEY = "fontsize";
    private static final String TEXT_VALUE_KEY = "textvalue";
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex7_1);
                
        editText = (EditText) findViewById(R.id.EditText01);
        seekBar = (SeekBar) findViewById(R.id.SeekBar01);
        btn = (Button) findViewById(R.id.btnSave);
        
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	
            }
        });        
        
        //---load the SharedPreferences object---
        //SharedPreferences prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        prefs = getSharedPreferences(prefName,MODE_PRIVATE);
        
        //---set the TextView font size to the previously saved values---
        float fontSize = prefs.getFloat(FONT_SIZE_KEY, 12);
        
        //---init the SeekBar and EditText---
        seekBar.setProgress((int) fontSize);
        editText.setText(prefs.getString(TEXT_VALUE_KEY, ""));
        editText.setTextSize(seekBar.getProgress());
        
        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {								
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				//---change the font size of the EditText---
				editText.setTextSize(progress);
			}
		}); 
    }

	@Override
	protected void onDestroy() {
		//---get the SharedPreferences object---
    	//prefs = getSharedPreferences(prefName, MODE_PRIVATE);
    	prefs = getSharedPreferences(prefName,MODE_PRIVATE);
    	
        SharedPreferences.Editor editor = prefs.edit();
        
        //---save the values in the EditText view to preferences---                
        editor.putFloat(FONT_SIZE_KEY, editText.getTextSize());  
        editor.putString(TEXT_VALUE_KEY, editText.getText().toString());
        
        //---saves the values---
        editor.commit();       
        
        //---display file saved message---
        Toast.makeText(getBaseContext(), 
            "Font size saved successfully!", 
            Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.ex1) {
            startActivity(new Intent(getApplicationContext(), Ex1_1.class));
            return true;
        }else if (id == R.id.ex2) {
            startActivity(new Intent(getApplicationContext(), Ex2_1.class));
            return true;
        }else if (id == R.id.ex3) {
            startActivity(new Intent(getApplicationContext(), Ex3_1.class));
            return true;
        }else if (id == R.id.ex4) {
            startActivity(new Intent(getApplicationContext(), Ex4_1.class));
            return true;
        }else if (id == R.id.ex5) {
            startActivity(new Intent(getApplicationContext(), Ex5_1.class));
            return true;
        }else if (id == R.id.ex6) {
            startActivity(new Intent(getApplicationContext(), Ex6_1.class));
            return true;
        }else if (id == R.id.ex7) {
            startActivity(new Intent(getApplicationContext(), Ex7_1.class));
            return true;
        }else if (id == R.id.ex8) {
            startActivity(new Intent(getApplicationContext(), Ex8_1.class));
            return true;
        }else  if (id == R.id.start) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}