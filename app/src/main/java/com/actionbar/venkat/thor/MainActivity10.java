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

public class MainActivity10 extends AppCompatActivity {
private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity10.this);
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
        button = findViewById(R.id.button27);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTelivision();;
            }
        });
        button = findViewById(R.id.button28);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openComputer();;
            }
        });
        button = findViewById(R.id.button29);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openModern();
            }
        });
        button = findViewById(R.id.button30);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRadio();
            }
        });
        button = findViewById(R.id.button42);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSolar();
            }
        });
        button = findViewById(R.id.button43);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpace();
            }
        });
        button = findViewById(R.id.button44);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAstronaut();
            }
        });
        button = findViewById(R.id.button49);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHeat();
            }
        });
        button = findViewById(R.id.button45);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInternet();
            }
        });
        button = findViewById(R.id.button48);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBenefits();
            }
        });
    }
    public void openTelivision(){
        Intent intent = new Intent(this,Telivision.class);
        startActivity(intent);
    }
    public void openComputer(){
        Intent intent = new Intent(this,Computer.class);
        startActivity(intent);
    }
    public void openModern(){
        Intent intent = new Intent(this,Modern.class);
        startActivity(intent);
    }
    public void openRadio(){
        Intent intent = new Intent(this,Radio.class);
        startActivity(intent);
    }
    public void openSolar(){
        Intent intent = new Intent(this,Solar.class);
        startActivity(intent);
    }
    public void openSpace(){
        Intent intent = new Intent(this,Space.class);
        startActivity(intent);
    }
    public void openAstronaut(){
        Intent intent = new Intent(this,Astronaut.class);
        startActivity(intent);
    }
    public void openHeat(){
        Intent intent = new Intent(this,Heat.class);
        startActivity(intent);
    }
    public void openInternet(){
        Intent intent = new Intent(this,Internet.class);
        startActivity(intent);
    }
    public void openBenefits(){
        Intent intent = new Intent(this,Benefits.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
