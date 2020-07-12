package com.example.app1;

import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String total = "@@@###@@@";
    EditText username_et;
    EditText password_et;
    TextView message_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password_et = (EditText) this.findViewById(R.id.editText1);
        username_et = (EditText) this.findViewById(R.id.editText1);
        message_tv = (TextView) findViewById(R.id.textView);
        this.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username_et.getText().toString().compareTo("admin") == 0) {
                    message_tv.setText("You can't login as admin");
                    return;
                }
                //hook taget
                message_tv.setText("Sending to the server :" + Base64.encodeToString((username_et.getText().toString() + ":" + password_et.getText().toString()).getBytes(), Base64.DEFAULT));
            }
        });
    }


}
