/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView num, fam, col, phs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        openNumAct();
        openFamAct();
        openColAct();
        openPhsAct();
        String numbers [] = new String[10];
        numbers[0]="one";
        numbers[1]="two";
        numbers[2]="three";
        numbers[3]="four";
        numbers[4]="five";
        numbers[5]="six";
        numbers[6]="seven";
        numbers[7]="eight";
        numbers[8]="nine";
        numbers[9]="ten";



    }
    public void openNumAct(){
        num = (TextView) findViewById(R.id.numbers);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NumberActivity.class);
                startActivity(intent);
            }
        });


    }
    public void openFamAct(){
        fam = (TextView) findViewById(R.id.family);
        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(intent);
            }
        });
    }
    public void openColAct(){
        col = (TextView)findViewById(R.id.colors);
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ColorActivity.class);
                startActivity(intent);
            }
        });
    }
    public void openPhsAct(){
        phs = (TextView)findViewById(R.id.phrases);
        phs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }




}
