package com.example.pr3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    TextView textLine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16, 16, 16, 16);
        textView.setText("SecondActivity");
        setContentView(textView);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("hello").toString();

        Context context = getApplicationContext();
        CharSequence text = "Полученное сообщение:" + name;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Button btnReg = (Button) findViewById(R.id.button4);
        btnReg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("MainActivity", "Button work");

            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("messange", textLine.getText().toString());

            setResult(RESULT_OK, intent);
            finish();
        }
        });
    }
}