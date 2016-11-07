package com.ksi.tarimcmis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        FindID();
    }

    private void FindID() {

    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button1:
                // 作物栽培
                Intent toCC = new Intent();
                toCC.setClass(MenuActivity.this, Crop_cultivation_Activity.class);
                startActivity(toCC);
                break;
            case R.id.button2:
                // 疫情通報
                Intent toOC = new Intent();
                toOC.setClass(MenuActivity.this, Outbreak_Communications_Activity.class);
                startActivity(toOC);
                break;
            case R.id.button3:
                //栽培資訊
                Intent toCI = new Intent();
                toCI.setClass(MenuActivity.this, Cultural_Information_Activity.class);
                startActivity(toCI);
                break;
            case R.id.button4:
                //病蟲害資訊
                Intent toPI = new Intent();
                toPI.setClass(MenuActivity.this, Pest_Information_Activity.class);
                startActivity(toPI);
                break;
            case R.id.button5:
                //資材工具
                Intent toMT = new Intent();
                toMT.setClass(MenuActivity.this, Merchandise_Tools_Activity.class);
                startActivity(toMT);
                break;
            case R.id.button6:
                Toast.makeText(view.getContext(), "測試項目6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                Intent toAM = new Intent();
                toAM.setClass(MenuActivity.this,Agricultural_management_Activity.class);
                startActivity(toAM);
                break;
            case R.id.button8:
                Toast.makeText(view.getContext(), "登出囉", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
