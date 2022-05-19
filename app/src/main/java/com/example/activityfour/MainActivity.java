package com.example.activityfour;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    String temptxt ="";
    EditText edtphone;
    EditText edtmessage;
    Intent outintent;
    public final static String phone = "phone";
    public final static String message = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.btn);
        temptxt = edtphone.getText().toString();
        outintent.putExtra(phone,temptxt);
        temptxt = edtmessage.getText().toString();
        outintent.putExtra(message,temptxt);
        btn.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
         outintent = new Intent(MainActivity.this,ActivityFourPage2.class);
              startActivity(outintent);
            }
        });
    }

    public void closemethod(View view) {
        finish();
    }
}