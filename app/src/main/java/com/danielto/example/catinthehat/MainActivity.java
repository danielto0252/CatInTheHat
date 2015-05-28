package com.danielto.example.catinthehat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button cat;
    private Button thing1;
    private Button thing2;
    private Button thingamajigger;
    private Button sally;
    private Button nick;
    private Button seuss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = (Button) findViewById(R.id.btn_cat);
        thing1 = (Button) findViewById(R.id.btn_thing_one);
        thing2 = (Button) findViewById(R.id.btn_thing_two);
        thingamajigger = (Button) findViewById(R.id.btn_thingamajigger);
        sally = (Button) findViewById(R.id.btn_sally);
        nick = (Button) findViewById(R.id.btn_nick);
        seuss = (Button) findViewById(R.id.btn_seuss);

        setupButtons();
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

    private void setupButtons() {
        cat.setOnClickListener(new ButtonClickListener("The cat is in the hat"));
        thing1.setOnClickListener(new ButtonClickListener("Thing 1 has lots of fun"));
        thing2.setOnClickListener(new ButtonClickListener("Thing 2 has no clue"));
        thingamajigger.setOnClickListener(new ButtonClickListener("Thingamajigger is also a gold digger..."));
        sally.setOnClickListener(new ButtonClickListener("Sally came from across the great valley"));
        nick.setOnClickListener(new ButtonClickListener("Nick also known as Mr. Slick"));
        seuss.setOnClickListener(new ButtonClickListener("Dr. Seuss, the man, the goose, the moose, and the one that loves apple juice"));
    }

    private class ButtonClickListener implements View.OnClickListener {

        private String toastMessage;

        public ButtonClickListener(String toastMessage) {
            this.toastMessage = toastMessage;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),
                    toastMessage,
                    Toast.LENGTH_LONG).show();
        }
    }
}
