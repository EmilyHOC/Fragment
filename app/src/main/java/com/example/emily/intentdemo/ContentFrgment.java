package com.example.emily.intentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ContentFrgment extends Fragment {
    private Button contentBut;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View fragmentView=inflater.inflate(R.layout.fragment_content,container,false);
        intiView(fragmentView);
        return fragmentView;
    }

    private void intiView(View fragmentView){
        textView=(TextView)fragmentView.findViewById(R.id.contentText);
        contentBut=(Button) fragmentView.findViewById(R.id.contentBut);
        contentBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("你好杨欣静");
            }
        });


    }
}
