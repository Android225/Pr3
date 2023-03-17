package com.example.pr3;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class liner_frag extends Fragment {
    String TAG = "Shuiiiii";
    View view;
    public liner_frag(){
        super(R.layout.liner_layout);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "онКреате");
        Toast.makeText(getActivity(), "онКреате", Toast.LENGTH_SHORT).show();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "онКреатеВиев", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "онКреатеВиев");

        view = inflater.inflate(R.layout.liner_layout, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textView = (TextView) view.findViewById(R.id.liner_Name);
            textView.setText(bundle.getString("Key"));
        }
        return view;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "онВиевКреатед");
        Toast.makeText(getActivity(), "онВиевКреатед", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "онСтоп");
        Toast.makeText(getActivity(), "онСтоп", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "ОнСаве");
        Toast.makeText(getActivity(), "ОнСаве", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG, "онДестройВиев");
        Toast.makeText(getActivity(), "онДестройВиев", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Дестрой");
        Toast.makeText(getActivity(), "онДестрой", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "ОнВиевСтате");
        Toast.makeText(getActivity(), "ОнВиевСтате", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "онСтарт");
        Toast.makeText(getActivity(), "онСтарт", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "онРесуме");
        Toast.makeText(getActivity(), "онРесуме", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "онПаусе");
        Toast.makeText(getActivity(), "онПаусе", Toast.LENGTH_SHORT).show();
    }

}
