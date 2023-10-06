package com.firtstprojectsuvojitsarker.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edName;
    Button myButton;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.edName);
        myButton = findViewById(R.id.myButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String inputName =  edName.getText().toString(); (ei line na lekhe sorasori nicher line o likha jaito)
             //  tvDisplay.setText(edName.getText().toString()+"\n has been added to server list");

               // String inputName = edName.getText().toString();
                tvDisplay.setText(edName.getText().toString()+"\n has been added to the server list");
            }
        });
    }
}