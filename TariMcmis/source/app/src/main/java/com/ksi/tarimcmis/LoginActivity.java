package com.ksi.tarimcmis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findID();

    }

    private void findID() {
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.forgetbtn:
                Toast.makeText(view.getContext(), "忘記密碼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginbtn:
                Intent toMenu = new Intent();
                toMenu.setClass(LoginActivity.this, MenuActivity.class);
                startActivity(toMenu);
                break;
        }
    }
}
