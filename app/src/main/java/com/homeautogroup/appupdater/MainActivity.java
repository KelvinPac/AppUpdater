package com.homeautogroup.appupdater;

/*
* By flyboypac@gmail.com (254705419309)
* Update library for android apps
* *****FEATURES********
* 1.Check update in On create
* 2. Check using a service periodically
* 3. Set Auto download in Wifi Mode
* eeeeeeeeeeeeeeeeeee
*/

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
