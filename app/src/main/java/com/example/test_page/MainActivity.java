package com.example.test_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

//    private void changeView(int index){
//        FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
//        FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
//
//        index += 1;
//        if(index>1){
//            index = 0;
//            fl1.setVisibility(View.VISIBLE);
//            fl2.setVisibility(View.INVISIBLE);
//        }else {
//            fl1.setVisibility(View.INVISIBLE);
//            fl2.setVisibility(View.VISIBLE);
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.map_pay222);

//        Button menubtn = (Button) findViewById(R.id.menubtn);
//        menubtn.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                changeView(0);
//            }
//        });
    }
}