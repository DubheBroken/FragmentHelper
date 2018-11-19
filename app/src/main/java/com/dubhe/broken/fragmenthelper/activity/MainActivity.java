package com.dubhe.broken.fragmenthelper.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dubhe.broken.fragmenthelper.R;
import com.dubhe.broken.fragmenthelper.fragment.Fragment2;
import com.dubhe.broken.fragmenthelper.FragmentHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView backHeaderCerti;
    private TextView toolbarTitleCerti;
    private FrameLayout frameMain;
    private Button btn_toFragment2;
    private Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initView();
    }

    private void initView() {
        backHeaderCerti = findViewById(R.id.back_header_certi);
        toolbarTitleCerti = findViewById(R.id.toolbar_title_certi);
        frameMain = findViewById(R.id.frame_main);
        btn_toFragment2 = findViewById(R.id.btn_to2);
        btn_toFragment2.setOnClickListener(this);

        backHeaderCerti.setOnClickListener(v -> onBackPressed());

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(context, "返回", Toast.LENGTH_SHORT).show();
        FragmentHelper.back(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_to2:
                FragmentHelper.switchFragment(new Fragment2(), this);
                break;
        }
    }
}
