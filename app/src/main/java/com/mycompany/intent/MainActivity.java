package com.mycompany.intent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mycompany.intent.IntentDemo2;
import com.mycompany.intent.R;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.url);
        et2 = (EditText) findViewById(R.id.phone);
        tv1 = (TextView) findViewById(R.id.textview1);
    }
    public void componentname(View v){
        ComponentName componentName=new ComponentName(this,IntentDemo2.class);
        Intent i1 =new Intent();
        i1.setComponent(componentName);
        startActivity(i1);
    }

    public void intentfilter(View v){
        String action="cn.edu.gdmec.kissme";
        Intent i2 =new Intent();
        i2.setAction(action);
        startActivity(i2);
    }

    public void view(View v){
        Intent i3 = new Intent();
        i3.setAction(Intent.ACTION_VIEW);
        Uri uri =Uri.parse(et1.getText().toString());
        i3.setData(uri);
        startActivity(i3);
    }

}
