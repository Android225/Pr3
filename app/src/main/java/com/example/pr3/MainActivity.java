package com.example.pr3;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    liner_frag liner__ = new liner_frag();
    relativ_frag relativ__ = new relativ_frag();
    ContentFragment content__ = new ContentFragment();

    TextView loadTitle;
    Button acitvButton;

    ActivityResultLauncher<Intent> dataRecieverActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == RESULT_OK){
                    Intent data = result.getData();

                    assert data != null;
                    loadTitle.setText(data.getStringExtra("messange"));
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);



        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,content__)
                .commit();


       // acitvButton = findViewById(R.id.acitvButton);

       /* View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Программно";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Log.e(TAG, "----");
            }
        };*/
    }
   /* public void onMyClick(View view) {
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
    }*/

  /*  public void Reg(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }*/
}