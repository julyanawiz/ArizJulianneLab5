package com.ariz.julianne;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void process2 (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button3){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button4){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5869°N, 120.9812°E"));
            chooser = Intent.createChooser(i, "Choose a Map Application:");
            startActivity(chooser);
        }
    }
}
