package com.example.pushmessage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Идентификатор уведомления
//    private static final int NOTIFY_ID = 101;
//    InstanceID myID = InstanceID.getInstance(this);

    // Идентификатор канала
//    private static String CHANNEL_ID = "SHAILYSHAI channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    public void Send(View view) {
//        Intent notificationIntent = new Intent(MainActivity.this, MainActivity.class);
//        PendingIntent contentIntent = PendingIntent.getActivity(MainActivity.this,
//                0, notificationIntent,
//                PendingIntent.FLAG_CANCEL_CURRENT);
//
//
//        NotificationCompat.Builder builder =
//                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
//                        .setContentTitle("Шайлушай")
//                        .setSmallIcon(R.drawable.ic_launcher_foreground)
//                        .setContentText("Вы стали ")
//                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                        .setContentIntent(contentIntent);
//
//
//        NotificationManagerCompat notificationManager =
//                NotificationManagerCompat.from(MainActivity.this);
//        notificationManager.notify(NOTIFY_ID, builder.build());
//    }
}
