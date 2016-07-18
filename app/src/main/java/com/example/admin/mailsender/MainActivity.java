package com.example.admin.mailsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.textView));
    }


    public void sendMessage(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, tv.getText().toString());
        i.putExtra(Intent.EXTRA_SUBJECT, "Android example");
        i.putExtra(Intent.EXTRA_EMAIL, "e-kuri@hotmail.com");
        startActivity(i);
    }
}
