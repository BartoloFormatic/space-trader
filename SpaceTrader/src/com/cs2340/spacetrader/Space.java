package com.cs2340.spacetrader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Space extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);
        TextView name = (TextView) findViewById(R.id.Planet1Name);
        TextView techLevel = (TextView) findViewById(R.id.Planet1TechLevel);
        TextView coords = (TextView) findViewById(R.id.Planet1Coords);
        //TODO - add Code for recovering the person object passed through intent...
        //as documented here: http://stackoverflow.com/questions/2736389/how-to-pass-object-from-one-activity-to-another-in-android
    
        name.setText("Planet 1 is named" + GameSetup.theMap.getPlanetArray()[0].getName());
        techLevel.setText("Planet 1 has tech level" +  GameSetup.theMap.getPlanetArray()[0].getTechLevel());
        int[] coordinates =  GameSetup.theMap.getPlanetArray()[0].getCoordinate();
        coords.setText("Planet 1 is located at " + coordinates[0] + ", " + coordinates[1]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_space, menu);
        return true;
    }
}