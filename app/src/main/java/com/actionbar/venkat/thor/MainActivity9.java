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

public class MainActivity9 extends AppCompatActivity {
   private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~5159000173");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity9.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial2_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();
            }
        });

        button = findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Studentlife();
            }
        });
        button = findViewById(R.id.button16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Hostellifew();
            }
        });
        button = findViewById(R.id.button17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Discipline();
            }
        });
        button = findViewById(R.id.button18);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Studentandolan();
            }
        });
        button = findViewById(R.id.button19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Stutentpoli();
            }
        });
        button = findViewById(R.id.button20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Rules();
            }
        });
        button = findViewById(R.id.button21);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Healthinst();
            }
        });
        button = findViewById(R.id.button22);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Goodst();
            }
        });
        button = findViewById(R.id.button23);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_StudentUnion();
            }
        });
        button = findViewById(R.id.button24);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Struggle();
            }
        });
        button = findViewById(R.id.button25);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Success();
            }
        });

    }
    public void open_Discipline(){
        Intent intent = new Intent(this,Discipline.class);
        startActivity(intent);
    }
    public void open_Studentlife(){
        Intent intent = new Intent(this,Studentlife.class);
        startActivity(intent);
    }
    public void open_Hostellifew(){
        Intent intent = new Intent(this,Hostellife.class);
        startActivity(intent);
    }
    public void open_Studentandolan(){
        Intent intent = new Intent(this,Studentandolan.class);
        startActivity(intent);
    }
    public void open_Stutentpoli(){
        Intent intent = new Intent(this,Studentpoli.class);
        startActivity(intent);
    }
    public void open_Rules() {
        Intent intent = new Intent(this, Rules.class);
        startActivity(intent);

    }
    public void open_Healthinst() {
        Intent intent = new Intent(this, Healthinst.class);
        startActivity(intent);

    }
    public void open_Goodst(){
        Intent intent = new Intent(this,Goodst.class);
        startActivity(intent);
    }
    public void open_StudentUnion(){
        Intent intent = new Intent(this,StudentUnion.class);
        startActivity(intent);
    }
    public void open_Struggle(){
        Intent intent = new Intent(this,Struggle.class);
        startActivity(intent);
    }
    public void open_Success(){

       Intent intent = new Intent(this,Success.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
