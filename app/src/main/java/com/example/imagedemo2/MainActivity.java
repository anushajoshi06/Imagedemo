package com.example.imagedemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
public void newDog(View view){
    ImageView image = (ImageView) findViewById(R.id.dog1imageView);
    image.setImageResource(R.drawable.dog2);
    Log.i("test", "button pressed");
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
