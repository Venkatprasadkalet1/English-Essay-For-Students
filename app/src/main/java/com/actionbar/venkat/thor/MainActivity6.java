package com.actionbar.venkat.thor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity6 extends AppCompatActivity {
private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity6.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();
            }
        });
        button = findViewById(R.id.button101);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiwali();
            }
        });
        button = findViewById(R.id.button102);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHoli();
            }
        });
        button = findViewById(R.id.button103);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDussehra();
            }
        });
        button = findViewById(R.id.button104);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDurgapuja();
            }
        });
        button = findViewById(R.id.button105);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJanmashtami();
            }
        });
        button = findViewById(R.id.button106);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGaneshchaturthi();
            }
        });
        button = findViewById(R.id.button107);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGurupurab();
            }
        });
        button = findViewById(R.id.button108);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRakshabandhan();
            }
        });
        button = findViewById(R.id.button109);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEidulfitr();
            }
        });
        button = findViewById(R.id.button110);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBihu();
            }
        });
        button = findViewById(R.id.button111);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHemis();
            }
        });
        button = findViewById(R.id.button112);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPongal();
            }
        });
        button = findViewById(R.id.button113);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChristmas();
            }
        });
        button = findViewById(R.id.button114);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEaster();
            }
        });
        button = findViewById(R.id.button115);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBaisakhi();
            }
        });
        button = findViewById(R.id.button116);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchfrweb();
            }
        });




    }
    public void openDiwali(){
        Intent intent = new Intent(this,Diwali.class);
        startActivity(intent);
    }
    public void openHoli(){
        Intent intent = new Intent(this,Holi.class);
        startActivity(intent);
    }
    public void openDussehra(){
        Intent intent = new Intent(this,Dussehra.class);
        startActivity(intent);
    }
    public void openDurgapuja(){
        Intent intent = new Intent(this,Durgapuja.class);
        startActivity(intent);
    }
    public void openJanmashtami(){
        Intent intent = new Intent(this,Janmashtami.class);
        startActivity(intent);
    }
    public void openGaneshchaturthi(){
        Intent intent = new Intent(this,Ganeshchaturthi.class);
        startActivity(intent);
    }
    public void openGurupurab(){
        Intent intent = new Intent(this,Gurupurab.class);
        startActivity(intent);
    }
    public void openRakshabandhan(){
        Intent intent = new Intent(this,Rakshabandhan.class);
        startActivity(intent);
    }
    public void openEidulfitr(){
        Intent intent = new Intent(this,Eidulfitr.class);
        startActivity(intent);
    }
    public void openBihu(){
        Intent intent = new Intent(this,Bihu.class);
        startActivity(intent);
    }
    public void openHemis(){
        Intent intent = new Intent(this,Hemis.class);
        startActivity(intent);
    }
    public void openPongal(){
        Intent intent = new Intent(this,Pongal.class);
        startActivity(intent);
    }

    public void openChristmas(){
        Intent intent = new Intent(this,Christmas.class);
        startActivity(intent);
    }

    public void openEaster(){
        Intent intent = new Intent(this,Easter.class);
        startActivity(intent);
    }
    public void openBaisakhi(){
        Intent intent = new Intent(this,Baisakhi.class);
        startActivity(intent);
    }
    public void openSearchfrweb(){
        Intent intent = new Intent(this,Searchfrweb.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
