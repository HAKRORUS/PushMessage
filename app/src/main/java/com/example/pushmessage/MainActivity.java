package com.example.pushmessage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    NotificationManagerCompat notificationManagerCompat;  //Менеджер который будет нам отправлять уведомление
    Notification notification; //Само уведомление


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent notificationIntent = new Intent(MainActivity.this, MainActivity.class); //Весь интент чтобы заново в прилоржение заходить
//        PendingIntent contentIntent = PendingIntent.getActivity(MainActivity.this,
//                0, notificationIntent,
//                PendingIntent.FLAG_CANCEL_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        NotificationChannel channel = new NotificationChannel("myCh", "My Channel", NotificationManager.IMPORTANCE_DEFAULT); // наш канал с уведомлениями
        NotificationManager manager = getSystemService(NotificationManager.class); // менеджер для канала
        manager.createNotificationChannel(channel); // создание канала уведомлений
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "myCh") // создаем наше уведомление
                .setSmallIcon(R.drawable.ic_launcher_foreground)     //Ставим Аватарку, можно поставить любую (если ввести android.R.drawable.stat_sys_upload будет анимированный значок)
                .setContentTitle("SHAILYSHAI") // пишем Название
                .setContentText("You are Shailyshai") // пишем Текст
//                .setStyle(new NotificationCompat.BigTextStyle().bigText()) нужно для сообщений с большим текстом
//                .setContentIntent(contentIntent);
//                .setColor(Color.GREEN) // изменение цвета круга около значка
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_launcher_background)); // большая картинка, можно поставить любую
        //notification.defaults = Notification.DEFAULT_ALL; // для добавления вибрации, фонарика, и звука до 26api
//        Uri ringURI =
//                RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION); // для выборочного звука до 26api
//        notification.sound = ringURI;
//        long[] vibrate = new long[] { 1000, 1000, 1000, 1000, 1000 }; //для выборочной вибрации до 26api
//        notification.vibrate = vibrate;
//        notification.flags = notification.flags | Notification.FLAG_ONGOING_EVENT; // FLAG_INSISTENT обычное, Notification.FLAG_ONGOING_EVENT
        notification = builder.build(); // сохраняем в уведомление
        notificationManagerCompat = NotificationManagerCompat.from(this); // хз че это
    }


    public void Send(View view) {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) { // тут проверка на разрешения(Необязательно)
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManagerCompat.notify(1, notification); // отправка сообщения
    }
}
