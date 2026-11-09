package com.example.javatestapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

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
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            Toast.makeText(this, "btn 1 was clicked", Toast.LENGTH_SHORT).show();
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> {
            Toast.makeText(this, "btn 2 was clicked", Toast.LENGTH_SHORT).show();
        });

        Button btn2 = findViewById(R.id.btn3);
        btn2.setOnClickListener(v -> {
            Toast.makeText(this, "btn 3 was clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
