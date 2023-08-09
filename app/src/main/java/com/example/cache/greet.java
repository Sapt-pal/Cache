package com.example.cache;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class greet extends AppCompatActivity {

    Button signUpBtn;
    EditText userName, password, confirmPswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        TextView welcomeText = findViewById(R.id.greetMsg);
        String name = getIntent().getStringExtra("username");
        welcomeText.setText("Welcome, "+name);

        signUpBtn = findViewById(R.id.signUpBtn);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        confirmPswd = findViewById(R.id.confirmPswd);
    }

    //button onClick method
    public void signUp(View view) {
        String name = userName.getText().toString();
        Toast.makeText(this, "Signing in " + name + " ...", Toast.LENGTH_SHORT).show();
    }
}
