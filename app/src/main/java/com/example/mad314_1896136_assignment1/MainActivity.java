package com.example.mad314_1896136_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.edinput1);
        ed2=(EditText)findViewById(R.id.edinput2);
        ed3=(EditText)findViewById(R.id.edinput3);
        b1=(Button)findViewById(R.id.btnsum);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SecondScreen.class);
                i.putExtra("input1",Integer.parseInt(ed1.getText().toString()));
                i.putExtra("input2",Integer.parseInt(ed2.getText().toString()));
                i.putExtra("input3",Integer.parseInt(ed3.getText().toString()));
                startActivity(i);
            }
        });
    }
}
