package com.example.sky.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView)findViewById(R.id.iv_test);
        img.setImageResource(R.drawable.jifen);

        Button btn = (Button)findViewById(R.id.btn_test);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_test:
                Toast.makeText(MainActivity.this, R.string.app_name, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
