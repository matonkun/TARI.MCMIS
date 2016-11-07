package com.ksi.tarimcmis;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private NotificationManager notificationManager;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setNotification();
        findID();


    }

    private void findID() {
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.forgetbtn:
                createNotification(getApplicationContext(),0);
                Toast.makeText(view.getContext(), "忘記密碼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginbtn:
                Intent toMenu = new Intent();
                toMenu.setClass(LoginActivity.this, MenuActivity.class);
                startActivity(toMenu);
                break;
        }
    }

    private void setNotification(){

        context = this;
        // 1.建立-通知服務管理器
        notificationManager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void createNotification(Context context, int nid) {
        // 2.建立-通知服務建構器
        Notification.Builder builder = new Notification.Builder(context);
        // 3.建立按下訊息嵌板後所要轉跳的Intent
        Intent intent = new Intent(context, LoginActivity.class);
        // 設定Intent標誌參數
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                Intent.FLAG_ACTIVITY_SINGLE_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // 設定請求碼
        int requestCode = 1;
        PendingIntent pendingIntent = PendingIntent.getActivity(context,
                requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        // 4.設定震動頻率
        long[] vibratepattern = { 100, 400, 500, 400 };
        // Respurces 轉 bitmap
        Bitmap bmp = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher);
        // 5.定義 Notification.Builder 建構器
        builder.setSmallIcon(R.mipmap.ic_launcher) // 通知服務 icon
                .setLargeIcon(bmp)
                .setContentTitle("作物生產管理通知") // 標題
                .setContentText("通知測試") // 內文
                .setLights(0xFFFFFFFF, 1000, 1000) // LED
                .setVibrate(vibratepattern) // 震動
                .setContentIntent(pendingIntent) // 設定Intent服務
                .setAutoCancel(true); // true：按下訊息嵌板後會自動消失
		/*
		在鎖屏上揭露完整訊息：Notification.VISIBILITY_PUBLIC
		基本的資訊與通知的圖示：Notification.VISIBILITY_PRIVATE（預設）
		在鎖屏上揭露訊息：Notification.VISIBILITY_SECRET
		*/
        builder.setVisibility(Notification.VISIBILITY_PRIVATE);
        // 抬頭顯示儀
            builder.setPriority(Notification.PRIORITY_HIGH); // 亦可帶入Notification.PRIORITY_MAX參數
        Notification notification = builder.build();
        notificationManager.notify(nid, notification); // 發佈Notification
    }

}
