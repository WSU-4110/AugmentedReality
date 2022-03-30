package com.example.augmented_reality_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class main_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
    }

    public void goToSo (View view) {
        goToUrl("https://www.amazon.com/AmazonBasics-High-Back-Executive-Swivel-Puresoft/dp/B07KXF19FN/ref=sr_1_15?crid=2YTBIK4TUNP7T&keywords=black+office+chair&qid=1648663015&sprefix=black+office+chair%2Caps%2C104&sr=8-15");
    }

    public void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}