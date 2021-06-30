package com.example.prodress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class reza extends AppCompatActivity {

    private Button btn_reza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reza);
        Casting();
    }

    private void Casting() {
        btn_reza = findViewById(R.id.btn_reza);
        btn_reza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(reza.this, "click in btn reza", Toast.LENGTH_SHORT).show();
            }
        });
    }
}