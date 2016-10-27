package com.ksi.tarimcmis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button LoginBtn,ForgetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findID();

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMenu = new Intent();
                toMenu.setClass(LoginActivity.this,MenuActivity.class);
                startActivity(toMenu);
            }
        });

    }

    private void findID(){
        LoginBtn = (Button)findViewById(R.id.loginbtn);
        ForgetBtn = (Button) findViewById(R.id.forgetbtn);
    }
}
