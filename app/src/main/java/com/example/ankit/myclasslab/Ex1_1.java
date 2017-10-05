package com.example.ankit.myclasslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex1_1 extends AppCompatActivity{

    private	static	final String TAG ="LifeCycleActivity1---->";
    private EditText text;
    private	String	KEY_SAVE__VALUE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_1);

            Log.v(TAG, "onCreate() is called");
            Button b = (Button) findViewById(R.id.button1);
            text = (EditText) findViewById(R.id.editText1);
            if (savedInstanceState != null) {
                if(savedInstanceState.containsKey(KEY_SAVE__VALUE)) { Log.v(TAG, "saveInstancestate() is called"); text.setText(savedInstanceState.getString(KEY_SAVE__VALUE));
                }

            }

            b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Ex1_1.this, Ex1_2.class);
                    i.putExtra("value1",text.getText().toString());
                    startActivity(i);
                }
            });
        }


        @Override

        public void onStart() {
            Log.v(TAG, "onStart() is called");
            super.onStart();
        }
      @Override

        public void onRestart() {
            Log.v(TAG, "onRestart() is called"); super.onRestart();
        }
        public void onResume() {
            Log.v(TAG, "onResume() is called"); super.onResume();
        }
        @Override
        public void onPause() {
            Log.v(TAG, "onPause() is called");
            super.onPause();
        }
        public void onStop() {
            Log.v(TAG, "onStop() is called"); super.onStop();
        }
        public void onDestroy() {
            Log.v(TAG, "onDestroy() is called"); super.onDestroy();
        }
        @Override
        public void onSaveInstanceState(Bundle outState) {
            outState.putString(KEY_SAVE__VALUE,text.getText().toString()); Log.v(TAG, "onSaveInstance() is called"); super.onSaveInstanceState(outState);
        }
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(TAG, "onRestoreInstanceState() is called");
        text.setText(savedInstanceState.getString(KEY_SAVE__VALUE));
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
