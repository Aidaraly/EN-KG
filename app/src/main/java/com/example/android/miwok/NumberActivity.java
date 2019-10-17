package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ArrayList<Numbers> numbers= new ArrayList<Numbers>();
        numbers.add(new Numbers("one","Бир"));
        numbers.add(new Numbers("two", "Эки"));
        numbers.add(new Numbers("three", "Уч"));
        numbers.add(new Numbers("four","Торт"));
        numbers.add(new Numbers("five","Беш"));
        numbers.add(new Numbers("six","Алты"));
        numbers.add(new Numbers("seven","Жети"));
        numbers.add(new Numbers("eight","Сегиз"));
        numbers.add(new Numbers("nine","Тогуз"));
        numbers.add(new Numbers("ten","Он"));

        NumberAdapter numberAdapter= new NumberAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.listV);
        listView.setAdapter(numberAdapter);







    }
}
