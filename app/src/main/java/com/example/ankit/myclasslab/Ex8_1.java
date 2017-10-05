package com.example.ankit.myclasslab;

import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Ex8_1 extends ListActivity {
    private SRMDataSource datasource;
    EditText commentEdit ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex8_1);

        datasource = new SRMDataSource(this);
        datasource.open();
        commentEdit = (EditText)findViewById(R.id.txt1);

        List<SRMQuerys> values = datasource.getAllSRMQuerys();

        // Use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<SRMQuerys> adapter = new ArrayAdapter<SRMQuerys>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    // Will be called via the onClick attribute
    public void onClick(View view) {
        @SuppressWarnings("unchecked")
        ArrayAdapter<SRMQuerys> adapter = (ArrayAdapter<SRMQuerys>) getListAdapter();
        SRMQuerys SRMQuerys = null;
        // Save the new SRMQuerys to the database
        SRMQuerys = datasource.createSRMQuerys(commentEdit.getText().toString());
        adapter.add(SRMQuerys);
        adapter.notifyDataSetChanged();
        commentEdit.setText("");

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {

        ArrayAdapter<SRMQuerys> adapter = (ArrayAdapter<SRMQuerys>) getListAdapter();
        SRMQuerys SRMQuerys = null;
        SRMQuerys = (SRMQuerys) getListAdapter().getItem(position);
        datasource.deleteSRMQuerys(SRMQuerys);
        adapter.remove(SRMQuerys);



        Toast.makeText(getApplicationContext()," YOU DELETED ONE ITEM on "+"'"+id+"'"+" POSITION",
                Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume() {
        datasource.open();
        super.onResume();
    }

    @Override
    protected void onPause() {
        datasource.close();
        super.onPause();
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
   