package com.example.kudas42ipzlab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);
    }

    public void Zapusk(View view)
    {
        int position = spinner.getSelectedItemPosition();
        String [] Discription = getResources().getStringArray(R.array.Opis);
        textView.setText(Discription[position]);
    }
}
