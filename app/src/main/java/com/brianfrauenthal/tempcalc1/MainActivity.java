package com.brianfrauenthal.tempcalc1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity{


    // comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText farenheitNum = (EditText) findViewById(R.id.farenheitNum);
        final EditText celciusNum = (EditText) findViewById(R.id.celciusNum);
        final Button calculate = (Button) findViewById(R.id.calculate);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView f = (TextView) findViewById(R.id.farenheitNum);
                int sb = Integer.valueOf(farenheitNum.getText().toString());
                int c = (sb - 32) * 5/9;

                celciusNum.setText(String.valueOf(c));
            }
        });
    }
}
