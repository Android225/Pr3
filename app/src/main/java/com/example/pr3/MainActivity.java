package com.example.pr3;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    }
    public void onMyClick(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Программно";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "F{F{{F{F{F", duration);
        toast.show();
        Log.e(TAG, "----");

        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();

        Bundle bundle = new Bundle();
        String text_ = String.valueOf(((EditText) content__
                .getView()
                .findViewById(R.id.liner_Name))
                .getText());
        bundle.putString("Key", text_);

        liner__.setArguments(bundle);

        fTrans.replace(R.id.fragment_container_view, liner__).addToBackStack(null).commit();

    }
    public void onClick_(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Программно";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "LOLOLOL", duration);
        toast.show();
        Log.e(TAG, "----");

        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();

        Bundle bundle = new Bundle();
        String text__ = String.valueOf(((EditText) liner__
                .getView()
                .findViewById(R.id.liner_Name))
                .getText());
        bundle.putString("Key1", text__);

        relativ__.setArguments(bundle);

        fTrans.replace(R.id.fragment_container_view, relativ__).addToBackStack(null).commit();
    }

    public void onClickRel(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Программно";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "HEHEHE", duration);
        toast.show();
        Log.e(TAG, "----");

        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();

        Bundle bundle = new Bundle();
        String text__ = String.valueOf(((EditText) relativ__
                .getView()
                .findViewById(R.id.relativName__))
                .getText());
        bundle.putString("Key2", text__);

        content__.setArguments(bundle);

        fTrans.replace(R.id.fragment_container_view, content__).addToBackStack(null).commit();
    }

}