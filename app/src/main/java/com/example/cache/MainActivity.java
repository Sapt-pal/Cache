package com.example.cache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cache.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void proceed(View view) {
        EditText userName = findViewById((R.id.userName));
        String name = userName.getText().toString();

        //start new activity on proceed and pass on name as intent extra
        Intent intent = new Intent(this, greet.class);
        intent.putExtra("username", name);
        Toast.makeText(this, "Proceeding...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}