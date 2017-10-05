package com.example.ankit.myclasslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.R.attr.rating;

public class Ex4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4_1);

        Button btnOpen = (Button) findViewById(R.id.btnOpen); btnOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),



                        "You	have	clicked	the	Open	button",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });
// ---ToggleButton---

        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle1);

        toggleButton.setOnClickListener(new View.OnClickListener() { public void onClick(View v) {

            if (((ToggleButton) v).isChecked()) DisplayToast("Toggle button is On");

            else
                DisplayToast("Toggle button is Off");
        }
        });
// ---EditText view---

        EditText text = (EditText) findViewById(R.id.txtName); text.addTextChangedListener(new TextWatcher() {

@Override

public void afterTextChanged(Editable s) { // TODO Auto-generated method stub

            }

@Override

public void beforeTextChanged(CharSequence s, int start, int count,int after) {
// TODO Auto-generated method stub

            }

public void onTextChanged(CharSequence s, int start, int before,int count) {

                DisplayToast("EditText text changed");

            }
        });




// ---CheckBox---

        CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);

        checkBox.setOnClickListener(new View.OnClickListener() { public void onClick(View v) {

            if (((CheckBox) v).isChecked()) DisplayToast("CheckBox is checked");

            else
                DisplayToast("CheckBox is unchecked");
        }
        });

// ---RadioButton---

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { public void onCheckedChanged(RadioGroup

                group, int checkedId) {
// ---displays the ID of the RadioButton that is
                    DisplayToast(Integer.toString(checkedId));
        }
        });

        SeekBar sbar = (SeekBar) findViewById(R.id.seekBar1);

        sbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

@Override

public void onStopTrackingTouch(SeekBar seekBar) { // TODO Auto-generated method stub

            }

@Override

public void onStartTrackingTouch(SeekBar seekBar) { // TODO Auto-generated method stub

            }

@Override



public void onProgressChanged(SeekBar seekBar, int progress,
            boolean fromUser) {

                DisplayToast("Progress bar value " + Integer.toString(progress));

            }
        });

        final RatingBar setRatingBar = (RatingBar) findViewById(R.id.setRating);

        setRatingBar

                .setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

@Override
public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) { DisplayToast("New Rating: " + rating);

            }
        });
    }

    private void DisplayToast(String msg) {

        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();

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