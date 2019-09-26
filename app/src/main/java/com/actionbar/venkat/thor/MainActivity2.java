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

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity2.this);
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
        button = findViewById(R.id.button50);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThefarmer();;
            }
        });
        button = findViewById(R.id.button51);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOrganicf();
            }
        });
        button = findViewById(R.id.button60);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPisciculture();
            }
        });
        button = findViewById(R.id.button52);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHorticulture();
            }
        });
        button = findViewById(R.id.button53);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPoultryfarming();
            }
        });
        button = findViewById(R.id.button54);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAgriculture();
            }
        });
        button = findViewById(R.id.button55);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPesticides();
            }
        });
         button = findViewById(R.id.button59);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGreenrevolution();
            }
        });
        button = findViewById(R.id.button56);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRoleoffarmer();
            }
        });

        button = findViewById(R.id.button57);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAutobiography();
            }
        });

        button = findViewById(R.id.button58);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchfromb();
            }
        });



    }
    public void openThefarmer(){
        Intent intent = new Intent(this,Thefarmer.class);
        startActivity(intent);
    }
    public void openOrganicf(){
        Intent intent = new Intent(this,Organicf.class);
        startActivity(intent);
    }
    public void openPisciculture(){
        Intent intent = new Intent(this,Pisciculture.class);
        startActivity(intent);
    }
    public void openHorticulture(){
        Intent intent = new Intent(this,Horticulture.class);
        startActivity(intent);
    }
    public void openPoultryfarming(){
        Intent intent = new Intent(this,Poultryfarming.class);
        startActivity(intent);
    }
    public void openAgriculture(){
        Intent intent = new Intent(this,Agriculture.class);
        startActivity(intent);
    }
    public void openPesticides(){
        Intent intent = new Intent(this,Pesticides.class);
        startActivity(intent);
    }
    public void openGreenrevolution(){
        Intent intent = new Intent(this,Greenrevolution.class);
        startActivity(intent);
    }
    public void openRoleoffarmer(){
        Intent intent = new Intent(this,Roleoffarmer.class);
        startActivity(intent);
    }
    public void openAutobiography(){
        Intent intent = new Intent(this,Autobiography.class);
        startActivity(intent);
    }
    public void openSearchfromb(){
        Intent intent = new Intent(this,Searchfromb.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
