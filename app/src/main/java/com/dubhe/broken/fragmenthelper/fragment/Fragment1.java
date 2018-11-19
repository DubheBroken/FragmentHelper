package com.dubhe.broken.fragmenthelper.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dubhe.broken.fragmenthelper.R;
import com.dubhe.broken.fragmenthelper.FragmentHelper;

public class Fragment1 extends Fragment implements View.OnClickListener {

    private Context context;
    private Button btnTo2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

        btnTo2 = view.findViewById(R.id.btn_to2);
        btnTo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_to2:
                FragmentHelper.switchFragment(new Fragment2(), (AppCompatActivity) getActivity());
                break;
        }
    }
}
