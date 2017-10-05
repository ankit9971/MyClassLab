package com.example.ankit.myclasslab;

/**
 * Created by Ganeshan on 8/9/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Ex6_2 extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public Ex6_2(Context context, String[] values) {
        super(context, R.layout.item_row, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_row, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
        // Change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("Sky") || s.startsWith("Spect")
                || s.startsWith("Casino") || s.startsWith("Quantom")) {
            imageView.setImageResource(R.drawable.bond2);
        } else {
            imageView.setImageResource(R.drawable.bond);
        }

        return rowView;
    }
}
   // To use this adapter, change the activity to the following.

