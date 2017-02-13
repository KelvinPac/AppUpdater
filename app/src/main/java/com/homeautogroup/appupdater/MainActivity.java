package com.homeautogroup.appupdater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Update update = new Update(getApplicationContext());
        update.setJsonUrl("http://192.168.56.1/app_login/updates/update.php");
        update.checkVersionCode();
        update.checkUpdate(update.getJSON_URL());

    }
}
