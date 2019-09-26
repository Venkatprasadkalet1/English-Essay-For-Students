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

public class MainActivity5 extends AppCompatActivity {
private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity5.this);
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
        button = findViewById(R.id.button81);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIndependenceday();
            }
        });
        button = findViewById(R.id.button82);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRepublicday();
            }
        });
        button = findViewById(R.id.button83);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGandhijayanti();
            }
        });
        button = findViewById(R.id.button84);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldhindiday();
            }
        });
        button = findViewById(R.id.button85);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArmyday();
            }
        });
        button = findViewById(R.id.button86);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvalentineday();
            }
        });
        button = findViewById(R.id.button87);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNationalscienceday();
            }
        });
        button = findViewById(R.id.button88);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldtbday();
            }
        });
        button = findViewById(R.id.button89);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldhealthday();
            }
        });
        button = findViewById(R.id.button90);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEarthday();
            }
        });
        button = findViewById(R.id.button91);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNationalpanchayatiday();
            }
        });
        button = findViewById(R.id.button92);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMothersday();
            }
        });
        button = findViewById(R.id.button93);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldredcrossday();
            }
        });
        button = findViewById(R.id.button94);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFathersday();
            }
        });
        button = findViewById(R.id.button95);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEngineersday();
            }
        });
        button = findViewById(R.id.button96);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldheartday();
            }
        });
        button = findViewById(R.id.button97);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldaidsday();
            }
        });
        button = findViewById(R.id.button98);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHumanrightsday();
            }
        });
        button = findViewById(R.id.button99);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChristmasday();
            }
        });
        button = findViewById(R.id.button100);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchfweb();
            }
        });
    }
    public void openIndependenceday(){
        Intent intent = new Intent(this,Independenceday.class);
        startActivity(intent);
    }
    public void openRepublicday(){
        Intent intent = new Intent(this,Republicday.class);
        startActivity(intent);
    }
    public void openGandhijayanti(){
        Intent intent = new Intent(this,Gandhijayanti.class);
        startActivity(intent);
    }
    public void openWorldhindiday(){
        Intent intent = new Intent(this,Worldhindiday.class);
        startActivity(intent);
    }
    public void openArmyday(){
        Intent intent = new Intent(this,Armyday.class);
        startActivity(intent);
    }
    public void openvalentineday(){
        Intent intent = new Intent(this,valentineday.class);
        startActivity(intent);
    }
    public void openNationalscienceday(){
        Intent intent = new Intent(this,Nationalscienceday.class);
        startActivity(intent);
    }
    public void openWorldtbday(){
        Intent intent = new Intent(this,Worldtbday.class);
        startActivity(intent);
    }
    public void openWorldhealthday(){
        Intent intent = new Intent(this,Worldhealthday.class);
        startActivity(intent);
    }
    public void openEarthday(){
        Intent intent = new Intent(this,Earthday.class);
        startActivity(intent);
    }
    public void openNationalpanchayatiday(){
        Intent intent = new Intent(this,Nationalpanchayatiday.class);
        startActivity(intent);
    }
    public void openMothersday(){
        Intent intent = new Intent(this,Mothersday.class);
        startActivity(intent);
    }
    public void openWorldredcrossday(){
        Intent intent = new Intent(this,Worldredcrossday.class);
        startActivity(intent);
    }
    public void openFathersday(){
        Intent intent = new Intent(this,Fathersday.class);
        startActivity(intent);
    }
    public void openEngineersday(){
        Intent intent = new Intent(this,Engineersday.class);
        startActivity(intent);
    }
    public void openWorldheartday(){
        Intent intent = new Intent(this,Worldheartday.class);
        startActivity(intent);
    }
    public void openWorldaidsday(){
        Intent intent = new Intent(this,Worldaidsday.class);
        startActivity(intent);
    }
    public void openHumanrightsday(){
        Intent intent = new Intent(this,Humanrightsday.class);
        startActivity(intent);
    }
    public void openChristmasday(){
        Intent intent = new Intent(this,Christmasday.class);
        startActivity(intent);
    }

    public void openSearchfweb(){
        Intent intent = new Intent(this,Searchfweb.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}
