package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generatePhrase(View view){
        String[] phrases = {
            "Frase 1",
            "Frase 2",
            "Frase 3",
            "Frase 4"
        };
        int number = new Random().nextInt(4);

        TextView text = findViewById(R.id.textResult);
        text.setText(phrases[number]);
    }
}
