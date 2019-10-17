package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Numbers> numbers= new ArrayList<Numbers>();
        numbers.add(new Numbers("Father","Ата"));
        numbers.add(new Numbers("Mother", "Эки"));
        numbers.add(new Numbers("Son", "Уч"));
        numbers.add(new Numbers("Doughter","Торт"));
        numbers.add(new Numbers("Grandfather","Беш"));
        numbers.add(new Numbers("Grandmother","Алты"));
        numbers.add(new Numbers("Grandson","Жети"));
        numbers.add(new Numbers("Uncle","Сегиз"));
        numbers.add(new Numbers("Aunt","Тогуз"));
        numbers.add(new Numbers("Parrent","Он"));

        NumberAdapter numberAdapter= new NumberAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.listV);
        listView.setAdapter(numberAdapter);
    }
}
