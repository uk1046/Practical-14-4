package com.example.scrollview;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView scrollView = findViewById(R.id.verticalScrollView);
        TextView textView = findViewById(R.id.textView);

        // Set the long text to the TextView
        textView.setText(getString(R.string.long_text));

        // Optional: Enable vertical scrolling programmatically
        // scrollView.setVerticalScrollBarEnabled(true);
    }
}
