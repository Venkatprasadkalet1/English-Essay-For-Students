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

public class MainActivity4 extends AppCompatActivity {
    private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity4.this);
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
        button = findViewById(R.id.button71);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSocialmedia();
            }
        });
        button = findViewById(R.id.button72);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWhatsapp();
            }
        });
        button = findViewById(R.id.button73);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstagram();
            }
        });
        button = findViewById(R.id.button74);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentwitter();
            }
        });
        button = findViewById(R.id.button75);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFacebook();
            }
        });
        button = findViewById(R.id.button76);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle();
            }
        });
        button = findViewById(R.id.button77);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYahoo();
            }
        });
        button = findViewById(R.id.button78);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYoutube();
            }
        });
        button = findViewById(R.id.button79);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmail();
            }
        });
        button = findViewById(R.id.button80);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensearchfwe();
            }
        });


    }
    public void openSocialmedia(){
        Intent intent = new Intent(this,Socialmedia.class);
        startActivity(intent);
    }
    public void openWhatsapp(){
        Intent intent = new Intent(this,Whatsapp.class);
        startActivity(intent);
    }
    public void openInstagram(){
        Intent intent = new Intent(this,Instagram.class);
        startActivity(intent);
    }
    public void opentwitter(){
        Intent intent = new Intent(this,Twitter.class);
        startActivity(intent);
    }
    public void openFacebook(){
        Intent intent = new Intent(this,Facebook.class);
        startActivity(intent);
    }
    public void openGoogle(){
        Intent intent = new Intent(this,Google.class);
        startActivity(intent);
    }
    public void openYahoo(){
        Intent intent = new Intent(this,Yahoo.class);
        startActivity(intent);
    }
    public void openYoutube(){
        Intent intent = new Intent(this,Youtube.class);
        startActivity(intent);
    }
    public void openEmail(){
        Intent intent = new Intent(this,Email.class);
        startActivity(intent);
    }
    public void opensearchfwe(){
        Intent intent = new Intent(this,searchfwe.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}
