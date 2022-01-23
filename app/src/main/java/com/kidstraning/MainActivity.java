package com.kidstraning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

Button animal;
ImageView animals, nembers, colors;
String type;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animals= (ImageView)findViewById(R.id.accAnimalsBtn);
        nembers= (ImageView)findViewById(R.id.accNumbersBtn);
    }

    public void MenuAnimals(View view){
        Intent intent = new Intent(MainActivity.this, ColorActivity.class);
        startActivity(intent);
    }

}
