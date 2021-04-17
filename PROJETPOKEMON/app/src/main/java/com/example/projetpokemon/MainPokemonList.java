package com.example.projetpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.projetpokemon.PokemonName;

public class MainPokemonList extends AppCompatActivity {

    private Button mPokemonButton1;
    private Button mPokemonButton2;
    private Button mPokemonButton3;
    private Button mPokemonButton4;
    private Button mPokemonButton5;
    private Button mPokemonButton6;
    private LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pokemon_list);

        this.myLayout = findViewById(R.id.myDynamicLayout);
        mPokemonButton1 = findViewById(R.id.activity_main_pokemon_list_button1);
        mPokemonButton2 = findViewById(R.id.activity_main_pokemon_list_button2);
        mPokemonButton3 = findViewById(R.id.activity_main_pokemon_list_button3);
        mPokemonButton4 = findViewById(R.id.activity_main_pokemon_list_button4);
        mPokemonButton5 = findViewById(R.id.activity_main_pokemon_list_button5);
        mPokemonButton6 = findViewById(R.id.activity_main_pokemon_list_button6);

        mPokemonButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityCanarticho = new Intent(MainPokemonList.this, ActivityCanarticho.class);
                startActivity(activityCanarticho);
            }
        });
        mPokemonButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityDodrio = new Intent(MainPokemonList.this, ActivityDodrio.class);
                startActivity(activityDodrio);
            }
        });
        mPokemonButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityFlagadoss = new Intent(MainPokemonList.this, ActivityFlagadoss.class);
                startActivity(activityFlagadoss);
            }
        });
        mPokemonButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityGalopa = new Intent(MainPokemonList.this, ActivityGalopa.class);
                startActivity(activityGalopa);
            }
        });
        mPokemonButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityLamantine = new Intent(MainPokemonList.this, ActivityLamantine.class);
                startActivity(activityLamantine);
            }
        });
        mPokemonButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityMagneton = new Intent(MainPokemonList.this, ActivityMagneton.class);
                startActivity(activityMagneton);
            }
        });



    }



}