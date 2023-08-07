package com.example.cache;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class greet extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        TextView welcomeText = findViewById(R.id.greetMsg);
        String name = getIntent().getStringExtra("username");
        welcomeText.setText("Welcome, "+name);
    }
}
