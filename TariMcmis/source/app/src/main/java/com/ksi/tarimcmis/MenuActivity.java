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
                Toast.makeText(view.getContext(), "測試項目3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(view.getContext(), "測試項目4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(view.getContext(), "測試項目5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(view.getContext(), "測試項目6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                Toast.makeText(view.getContext(), "測試項目7", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                Toast.makeText(view.getContext(), "測試項目8", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
