package com.example.ankit.myclasslab;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Ex6_1 extends ListActivity {
    String[] bond_films = { "Dr.No", "Man with Golden gun",
            "You only Live twice", "Live and Let die", "Thunderball",
            "License to Kill", "From Russia with Love", "Moonraker",
            "Octopussy", "A View to Kill", "On Her Majesty Service",
            "Golden Eye","Tommorrow never Dies","Never say never  again","Casino Royale",
            "Sky Fall","Spectere","Quantom of Solace","Die another day","On Your Majesty Service","Gold finger","Diamonds are for Ever"


    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex6_1);
        // use your custom layout
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        R.layout.item_row, R.id.label, bond_films);
        Ex6_2 adapter = new Ex6_2(this, bond_films);
        setListAdapter(adapter);
      //  setListAdapter(new ArrayAdapter<String>(this,
      //          android.R.layout.simple_list_item_1, bond_films));
        ListView lstView = getListView();
       lstView.setTextFilterEnabled(true);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "You have selected " + bond_films[position],
                Toast.LENGTH_SHORT).show();
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