package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberAdapter extends ArrayAdapter<Numbers> {
    private static final String LOG_TAG = NumberAdapter.class.getSimpleName();


    public NumberAdapter(Activity context, ArrayList<Numbers> numbers) {

        super(context, 0, numbers);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


         Numbers currentNumber = getItem(position);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.MiwokId);

        miwokTextView.setText(currentNumber.getMiwokTrans());


        TextView defTextView = (TextView) listItemView.findViewById(R.id.Default_text);

        defTextView.setText(currentNumber.getDefTrans());




        return listItemView;
    }
}
