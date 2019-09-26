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

public class MainActivity7 extends AppCompatActivity {
    private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity7.this);
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
        button = findViewById(R.id.button117);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBusiness();
            }
        });
        button = findViewById(R.id.button118);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCottageindustry();
            }
        });
        button = findViewById(R.id.button119);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLightindustry();
            }
        });
        button = findViewById(R.id.button120);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openManufacturing();
            }
        });
        button = findViewById(R.id.button121);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimberindustry();
            }
        });
        button = findViewById(R.id.button122);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPharmaceuticalindustry();
            }
        });
        button = findViewById(R.id.button123);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSoftwareindustry();
            }
        });
        button = findViewById(R.id.button124);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTechnologyindustry();
            }
        });
        button = findViewById(R.id.button125);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRealestateindustry();
            }
        });
        button = findViewById(R.id.button126);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFilmindustry();
            }
        });
        button = findViewById(R.id.button127);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldwidewave();
            }
        });
        button = findViewById(R.id.button127);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorldwidewave();
            }
        });
        button = findViewById(R.id.button128);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMining();
            }
        });
        button = findViewById(R.id.button129);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIndustryurevolution();
            }
        });
        button = findViewById(R.id.button130);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchfromweb();
            }
        });

    }

    public void openBusiness() {
        Intent intent = new Intent(this, Business.class);
        startActivity(intent);
    }

    public void openCottageindustry() {
        Intent intent = new Intent(this, Cottageindustry.class);
        startActivity(intent);
    }
    public void openLightindustry() {
        Intent intent = new Intent(this,Lightindustry.class);
        startActivity(intent);
    }
    public void openManufacturing() {
        Intent intent = new Intent(this,Manufacturing.class);
        startActivity(intent);
    }
    public void openTimberindustry() {
        Intent intent = new Intent(this,Timberindustry.class);
        startActivity(intent);
    }
    public void openPharmaceuticalindustry() {
        Intent intent = new Intent(this,Pharmaceuticalindustry.class);
        startActivity(intent);
    }
    public void openTechnologyindustry() {
        Intent intent = new Intent(this,Technologyindustry.class);
        startActivity(intent);
    }
    public void openSoftwareindustry() {
        Intent intent = new Intent(this,Softwareindustry.class);
        startActivity(intent);
    }
    public void openRealestateindustry() {
        Intent intent = new Intent(this,Realestateindustry.class);
        startActivity(intent);
    }
    public void openFilmindustry() {
        Intent intent = new Intent(this,Filmindustry.class);
        startActivity(intent);
    }
    public void openWorldwidewave() {
        Intent intent = new Intent(this,Worldwidewave.class);
        startActivity(intent);
    }
    public void openMining() {
        Intent intent = new Intent(this,Mining.class);
        startActivity(intent);
    }
    public void openIndustryurevolution() {
        Intent intent = new Intent(this,Industryrevolution.class);
        startActivity(intent);
    }
    public void openSearchfromweb() {
        Intent intent = new Intent(this,Searchfromweb.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }

    }
    }
