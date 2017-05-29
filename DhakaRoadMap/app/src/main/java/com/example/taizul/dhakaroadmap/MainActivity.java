package com.example.taizul.dhakaroadmap;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_n,button_h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListener();
        ButtonClickListener();
    }

   public void onButtonClickListener() {
        button_n = (Button) findViewById(R.id.button1);
        button_n.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.taizul.dhakaroadmap.MapsActivity");
                        startActivity(intent);
                          finish();
                    }
                }
        );
    }

   /*public void currentLocation(View view)
    {
        Intent intent = new Intent();
        intent.setAction("com.example.taizul.dhakaroadmap.HomeMapsActivity");
        startActivity(intent);
    }  */
  public void ButtonClickListener() {
       button_h = (Button) findViewById(R.id.button);
       button_h.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent();
                       intent.setAction("com.example.taizul.dhakaroadmap.HomeMapsActivity");
                       startActivity(intent);
                   }

               }
       );
   }

}
