package com.example.mad314_1896136_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
TextView tv1,tv2;
Button btnprev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        tv1=(TextView)findViewById(R.id.tvshowsum);
        tv2=(TextView)findViewById(R.id.tvshowproduct);
        btnprev=(Button) findViewById(R.id.btnprevious);

        Intent i = getIntent();
        int number1 =i.getIntExtra("input1",0);
        int number2 =i.getIntExtra("input2",0);
        int number3 =i.getIntExtra("input3",0);
        tv1.setText("Sum - "+(number1+number2+number3));
        tv2.setText("Product - "+(number1*number2*number3));
        btnprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}
