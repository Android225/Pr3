package com.example.pr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    Button acitvButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acitvButton = findViewById(R.id.acitvButton);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Программно";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Log.e(TAG, "----");
            }
        };
    }
    public void onMyClick(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Переход на second Activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Log.e(TAG, "Вывод ошибок в журнал");

        // создание объекта Intent для запуска SecondActivity
        Intent intent = new Intent(this, SecondActivity.class);
        // передача объекта с ключом "hello" и значением "Hello World"
        intent.putExtra("hello", "Hello World");
        // запуск SecondActivity
        startActivity(intent);
    }

    public void Reg(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}