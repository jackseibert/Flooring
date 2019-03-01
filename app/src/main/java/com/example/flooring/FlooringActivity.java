package com.example.flooring;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FlooringActivity extends AppCompatActivity {

    TextView tvResult;
    EditText etWidth;
    EditText etLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring);

        tvResult = (TextView) findViewById(R.id.textViewResult);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*Bundle extras = getIntent().getExtras();
        tvResult.setText("Width is " + (etWidth.getText().toString()) + " and Length is " + (etLength.getText().toString())
        + " and flooring needed is ");*/

    }

}
