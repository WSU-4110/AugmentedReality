package com.example.augmented_reality_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class main_app extends AppCompatActivity {
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        logout  = (Button) findViewById(R.id.signOut);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(main_app.this, MainActivity.class));
            }
        });
    }

    public void goToSo (View view) {
        goToUrl("https://www.amazon.com/AmazonBasics-High-Back-Leather-Executive-Computer/dp/B082KYYMZ6/ref=sr_1_13?crid=15MNJC9L1F9PI&keywords=fake%2Bleather%2Boffice%2Bchair&qid=1648752690&sprefix=fake%2Bleather%2Boffice%2Bchair%2Caps%2C63&sr=8-13&th=1");
    }

    public void goToArozzi (View view) {
        goToUrl("https://www.amazon.com/Arozzi-Verona-JR-Black-Computer-Gaming-Office/dp/B07C7CK94N/ref=sr_1_24?crid=3JTD6TYE30QQT&keywords=office+chair&qid=1648750564&s=electronics&sprefix=office+chair%2Celectronics%2C98&sr=1-24");
    }

    public void goToArmless (View view) {
        goToUrl("https://www.amazon.com/Bowthy-Armless-Ergonomic-Computer-Without/dp/B085C1PHQT/ref=sr_1_47?crid=3MSPM1Q4T5U3J&keywords=armless%2Boffice%2Bchair&qid=1648753331&sprefix=armless%2Boffice%2Bchair%2Caps%2C134&sr=8-47&th=1");
    }

    public void goToFoldable (View view) {
        goToUrl("https://www.wayfair.com/school-furniture-and-supplies/pdp/virco-162-162-series-folding-chair-with-plastic-caps-vr10091.html?piid=50111734");
    }

    public void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }




}
