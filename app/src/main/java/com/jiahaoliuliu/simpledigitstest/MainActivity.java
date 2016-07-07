package com.jiahaoliuliu.simpledigitstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TwitterAuthConfig authConfig = new TwitterAuthConfig(APIKeys.TWITTER_KEY, APIKeys.TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits());
    }
}
