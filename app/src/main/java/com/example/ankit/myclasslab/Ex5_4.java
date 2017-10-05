package com.example.ankit.myclasslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Ex5_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5_4);
    }

    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(), Ex5_5.class));
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
