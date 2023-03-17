package com.example.pr3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class relativ_frag extends Fragment {
    View view;
    public relativ_frag(){
        super(R.layout.relative_layout);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "onCreateView", Toast.LENGTH_SHORT).show();

        view = inflater.inflate(R.layout.relative_layout, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textView = (TextView) view.findViewById(R.id.relativName__);
            textView.setText(bundle.getString("Key1"));
        }

        return view;
    }

}
