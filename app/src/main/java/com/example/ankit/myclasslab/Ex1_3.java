package com.example.ankit.myclasslab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex1_3 extends AppCompatActivity {

    EditText txt;
    private static final String TAG = "LifeCycleActivity3---->";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_3);

        Log.v(TAG, "onCreate() is called");
        Button b=(Button)findViewById(R.id.button1);
        txt=(EditText)findViewById(R.id.editText1);

    }
    public void gotoSecond(View v)
    {
        Intent data = new Intent();
        data.setData(Uri.parse(txt.getText().toString()));
        setResult(RESULT_OK, data);
        finish();
    }

    @Override
    public void onStart() {
        Log.v(TAG, "onStart() is called");
        super.onStart();

    }
    @Override
    public void onRestart() {
        Log.v(TAG, "onRestart() is called");
        super.onRestart();
    }

    @Override
    public void onResume() {
        Log.v(TAG, "onResume() is called");
        super.onResume();
    }
    @Override
    public void onPause() {
        Log.v(TAG, "onPause() is called");
        super.onPause();
    }
    @Override
    public void onStop() {
        Log.v(TAG, "onStop() is called");
        super.onStop();
    }
    @Override
    public void onDestroy() {
        Log.v(TAG, "onDestroy() is called");
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
