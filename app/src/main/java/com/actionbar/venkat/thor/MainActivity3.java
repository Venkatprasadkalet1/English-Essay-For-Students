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

public class MainActivity3 extends AppCompatActivity {
    private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity3.this);
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
        button = findViewById(R.id.button61);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnvironment();
            }
        });
        button = findViewById(R.id.button62);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnviropollu();
            }
        });
        button = findViewById(R.id.button63);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAirpollution();
            }
        });
        button = findViewById(R.id.button64);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwaterpollution();
            }
        });
        button = findViewById(R.id.button65);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSoilpollution();
            }
        });
        button = findViewById(R.id.button66);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEarth();
            }
        });
        button = findViewById(R.id.button67);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEarthpollution();
            }
        });
        button = findViewById(R.id.button68);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBiosphere();
            }
        });
        button = findViewById(R.id.button69);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGlobalwarming();
            }
        });
        button = findViewById(R.id.button70);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchfw();
            }
        });
    }
    public void openEnvironment(){
        Intent intent = new Intent(this,Environment.class);
        startActivity(intent);
    }
    public void openEnviropollu(){
        Intent intent = new Intent(this,Enviropollu.class);
        startActivity(intent);
    }
    public void openAirpollution(){
        Intent intent = new Intent(this,Airpollution.class);
        startActivity(intent);
    }
    public void openwaterpollution(){
        Intent intent = new Intent(this,waterpollution.class);
        startActivity(intent);
    }
    public void openSoilpollution(){
        Intent intent = new Intent(this,Soilpollution.class);
        startActivity(intent);
    }
    public void openEarth(){
        Intent intent = new Intent(this,Earth.class);
        startActivity(intent);
    }
    public void openEarthpollution(){
        Intent intent = new Intent(this,Earthpollution.class);
        startActivity(intent);
    }
    public void openBiosphere(){
        Intent intent = new Intent(this,Biosphere.class);
        startActivity(intent);
    }

    public void openGlobalwarming(){
        Intent intent = new Intent(this,Globalwarming.class);
        startActivity(intent);
    }
    public void openSearchfw(){
        Intent intent = new Intent(this,Searchfw.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
