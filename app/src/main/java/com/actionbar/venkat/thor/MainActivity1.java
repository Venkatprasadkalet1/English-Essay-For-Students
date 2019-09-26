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

public class MainActivity1 extends AppCompatActivity {
    private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        AdRequest adRequest = new AdRequest.Builder().build();
MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity1.this);
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
        button = findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe_cow();;
            }
        });
        button = findViewById(R.id.button38);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe_Tiger();;
            }
        });
        button = findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe_Lion();;
            }
        });
        button = findViewById(R.id.button41);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe_Crow();
            }
        });
        button = findViewById(R.id.button36);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe_Dog();;
            }
        });
        button = findViewById(R.id.button39);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe_Bullock();;
            }
        });
        button = findViewById(R.id.button37);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Bottle();
            }
        });
        button = findViewById(R.id.button40);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_How();
            }
        });
        button = findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Reason();
            }
        });
        button = findViewById(R.id.button15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Teacup();
            }
        });
        button = findViewById(R.id.button31);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Intro();
            }
        });
        button = findViewById(R.id.button32);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Howto();
            }
        });
        button = findViewById(R.id.button33);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Injured();
            }
        });
        button = findViewById(R.id.button34);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Taking();
            }
        });
        button = findViewById(R.id.button35);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Write();
            }
        });
    }
    public void openThe_cow(){
        Intent intent = new Intent(this,The_Cow.class);
        startActivity(intent);
    }
    public void openThe_Tiger(){
        Intent intent = new Intent(this,The_tiger.class);
        startActivity(intent);
    }
    public void openThe_Lion(){
        Intent intent = new Intent(this,The_Lion.class);
        startActivity(intent);
    }
    public void openThe_Crow(){
        Intent intent = new Intent(this,The_Crow.class);
        startActivity(intent);
    }
    public void openThe_Dog(){
        Intent intent = new Intent(this,The_Dog.class);
        startActivity(intent);
    }
    public void openThe_Bullock(){
        Intent intent = new Intent(this,The_Bullock.class);
        startActivity(intent);
    }
    public void open_Bottle(){
        Intent intent = new Intent(this,Bottle.class);
        startActivity(intent);
    }
    public void open_How(){
        Intent intent = new Intent(this,How.class);
        startActivity(intent);
    }
    public void open_Reason(){
        Intent intent = new Intent(this,Reason.class);
        startActivity(intent);
    }
    public void open_Teacup(){
        Intent intent = new Intent(this,Teacup.class);
        startActivity(intent);
    }
    public void open_Intro(){
        Intent intent = new Intent(this,Intro.class);
        startActivity(intent);
    }
    public void open_Howto(){
        Intent intent = new Intent(this,Howto.class);
        startActivity(intent);
    }
    public void open_Injured(){
        Intent intent = new Intent(this,Injured.class);
        startActivity(intent);
    }
    public void open_Taking(){
        Intent intent = new Intent(this,Taking.class);
        startActivity(intent);
    }
    public void open_Write(){
        Intent intent = new Intent(this,Write.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
