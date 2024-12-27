package com.example.rabiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
           //mEYVE bUTONU
            Button meyveButonu = findViewById(R.id.buttonMeyve);
            meyveButonu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent hedef= new Intent(MainActivity.this,meyveler.class );
                    startActivity(hedef);

                }

            });
            //Sebze Butonu
            Button sebzeButonu = findViewById(R.id.buttonSebze);
            sebzeButonu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent hedef = new Intent(MainActivity.this,sebzeler.class);
                    startActivity(hedef);
                }
            });
            //Tatlı butonu
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}