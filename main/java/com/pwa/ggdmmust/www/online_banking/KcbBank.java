package com.pwa.ggdmmust.www.online_banking;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KcbBank extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcb_bank);
        Button submit=(Button) findViewById(R.id.button);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent KcbServices=new Intent(this,KcbServices.class);
        startActivity(KcbServices);

    }
}
