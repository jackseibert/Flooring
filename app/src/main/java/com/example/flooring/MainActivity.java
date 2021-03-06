package com.example.flooring;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etWidth;
    EditText etLength;
    TextView tvResult;
    Button calcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);
        tvResult = (TextView) findViewById(R.id.textViewResult);
        calcButton = (Button) findViewById(R.id.buttonCalc);

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

        calcButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                // Call the flooring activity using an intent
                //Intent detailActIntent = new Intent(v.getContext(), FlooringActivity.class);
                String widthText = etWidth.getText().toString();
                String lengthText = etLength.getText().toString();
                Flooring flooring = new Flooring(Integer.parseInt(etWidth.getText().toString()),
                        Integer.parseInt(etLength.getText().toString()));
                Intent detailActIntent = new Intent(v.getContext(), FlooringActivity.class);
                //Intent detailActIntent = new Intent(this, FlooringActivity.class);
                detailActIntent.putExtra("Flooring", flooring);
                //detailActIntent.putExtra("etWidth", etWidth.getText().toString());
                //double width = Double.parseDouble(etWidth.getText().toString());
                //detailActIntent.putExtra("etLength", etLength.getText());
                //double length = Double.parseDouble(etLength.getText().toString());
                startActivity(detailActIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
