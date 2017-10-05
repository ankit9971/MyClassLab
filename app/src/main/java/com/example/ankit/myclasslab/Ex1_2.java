package com.example.ankit.myclasslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ex1_2 extends AppCompatActivity {

    private int request_Code = 1;

    TextView txt;

    private static final String TAG ="LifeCycleActivity2--->";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_2);
        Log.v(TAG, "onCreate() is called");

        Button b = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Ex1_2.this,Ex1_3.class), request_Code);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ex1_2.this,Ex1_1.class));
            }
        });
        Bundle bundle = getIntent().getExtras();
        txt = (TextView) findViewById(R.id.textView1);
        txt.setText(bundle.getString("value1"));
    }
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == request_Code) {
                if (resultCode == RESULT_OK) {
                    txt.setText(data.getData().toString());
                }
            }
        }
        public void onStart() {
            Log.v(TAG, "onStart() is called");
            super.onStart();
        }
        public void onRestart() {
            Log.v(TAG, "onRestart() is called"); super.onRestart();
        }
        public void onResume() {
            Log.v(TAG, "onResume() is called");
            super.onResume();
        }
        public void onPause() {
            Log.v(TAG, "onPause() is called");
            super.onPause();
        }
        public void onStop() {
            Log.v(TAG, "onStop() is called");
            super.onStop();
        }

        public void onDestroy() {

            Log.v(TAG, "onDestroy() is called"); super.onDestroy();

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
