package com.example.pankaj.app27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtAnimal = findViewById(R.id.txtAnimal);
        TextView txtLion = findViewById(R.id.txtLion);
        TextView txtPolymorphism = findViewById(R.id.txtPolymorphism);

        Animal animal   = new Animal("Bear", "Black",40,20);
        Lion lion   = new Lion("myLion","Yello",60,40,true,170);

        txtAnimal.setText(animal.toString());
        txtLion.setText(lion.toString());

        Animal myAnimal1 = lion;
        txtPolymorphism.setText(myAnimal1.toString());

    }
}
