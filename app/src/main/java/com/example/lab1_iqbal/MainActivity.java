package com.example.lab1_iqbal;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText; // Added import for EditText
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvMessage;
    Button submitbutton;
    EditText etName; // Declare EditText for user input

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = findViewById(R.id.textView);
        submitbutton = findViewById(R.id.button);
        etName = findViewById(R.id.editText); // Initialize etName to the EditText in your layout
    }

    @SuppressLint("SetTextI18n")
    public void displayText(View view) {
        String text = etName.getText().toString(); // Get the text from the EditText

        if (!text.isEmpty()) {
            tvMessage.setText("Welcome, " + text);
            Toast toast = Toast.makeText(this, "Welcome, " + text, Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetText(View view) {
        etName.getText().clear();
        tvMessage.setText("");
        Toast toast = Toast.makeText(this, "Name Reset", Toast.LENGTH_SHORT);
        toast.show();
    }
}

