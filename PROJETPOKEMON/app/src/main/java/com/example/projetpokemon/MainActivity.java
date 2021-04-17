package com.example.projetpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailInput;
    private EditText mPassWordInput;
    private Button mGoPlayButton;
    private User mUser;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mUser = new User();
        mEmailInput = findViewById(R.id.activity_main_enter_mail);
        mPassWordInput = findViewById(R.id.activity_main_enter_password);
        mGoPlayButton = findViewById(R.id.activity_main_go_button);

        Toast toast = new Toast(this);
        ImageView view = new ImageView(this);
        view.setImageResource(R.drawable.thunder);





        mGoPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEmailInput.getText().toString().equals("admin@admin.com")  &&
                        mPassWordInput.getText().toString().equals("admin"))

                {
                    mGoPlayButton.setEnabled(true);
                    Intent mainPokemonList = new Intent(MainActivity.this, MainPokemonList.class);
                    startActivity(mainPokemonList);
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    toast.setView(view);
                    toast.show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "INCORRECT", Toast.LENGTH_SHORT).show();
                }

            }
        });
















    }
}