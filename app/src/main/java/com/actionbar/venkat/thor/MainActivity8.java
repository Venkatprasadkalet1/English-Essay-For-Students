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

public class MainActivity8 extends AppCompatActivity {
private Button button;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9470171691477952~4999925912");
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity8.this);
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
        button = findViewById(R.id.button131);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMahatmagandhi();
            }
        });
        button = findViewById(R.id.button132);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubhaschandrabose();
            }
        });
        button = findViewById(R.id.button133);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChandrashekharazad();
            }
        });
        button = findViewById(R.id.button134);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJawaharlalnehru();
            }
        });
        button = findViewById(R.id.button135);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRanilakshmibai();
            }
        });
        button = findViewById(R.id.button136);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrRajendraprasad();
            }
        });
        button = findViewById(R.id.button137);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSardarvallabhaipatel();
            }
        });
        button = findViewById(R.id.button138);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMangalpandey();
            }
        });
        button = findViewById(R.id.button139);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrbabasahebambedkar();
            }
        });
        button = findViewById(R.id.button140);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSarojininaidu();
            }
        });
        button = findViewById(R.id.button141);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTantiatope();
            }
        });
        button = findViewById(R.id.button142);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUdhamsingh();
            }
        });
        button = findViewById(R.id.button143);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBalgangadhartilak();
            }
        });
        button = findViewById(R.id.button144);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSukhdev();
            }
        });
        button = findViewById(R.id.button145);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAnniebesant();
            }
        });
        button = findViewById(R.id.button146);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDadabhainaoroji();
            }
        });

        button = findViewById(R.id.button147);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBipinchandrapal();
            }
        });
        button = findViewById(R.id.button148);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKmmunshi();
            }
        });
        button = findViewById(R.id.button149);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchfromweb1();
            }
        });



    }
    public void openMahatmagandhi() {
        Intent intent = new Intent(this, Mahatmagandhi.class);
        startActivity(intent);
    }

    public void openSubhaschandrabose() {
        Intent intent = new Intent(this, Subhashchandrabose.class);
        startActivity(intent);
    }
    public void openChandrashekharazad() {
        Intent intent = new Intent(this, Chandrashekharazad.class);
        startActivity(intent);
    }
    public void openJawaharlalnehru() {
        Intent intent = new Intent(this, Jawaharlalnehru.class);
        startActivity(intent);
    }
    public void openRanilakshmibai() {
        Intent intent = new Intent(this, Ranilakshmibai.class);
        startActivity(intent);
    }
    public void openDrRajendraprasad() {
        Intent intent = new Intent(this, DrRajendraprasad.class);
        startActivity(intent);
    }
    public void openSardarvallabhaipatel() {
        Intent intent = new Intent(this, Sardarvallabhaipatel.class);
        startActivity(intent);
    }
    public void openMangalpandey() {
        Intent intent = new Intent(this, Mangalpandey.class);
        startActivity(intent);
    }
    public void openDrbabasahebambedkar() {
        Intent intent = new Intent(this, Drbabasahebambedkar.class);
        startActivity(intent);
    }
    public void openSarojininaidu() {
        Intent intent = new Intent(this,Sarojininaidu.class);
        startActivity(intent);
    }
    public void openTantiatope() {
        Intent intent = new Intent(this,Tantiatope.class);
        startActivity(intent);
    }
    public void openUdhamsingh() {
        Intent intent = new Intent(this,Udhamsingh.class);
        startActivity(intent);
    }
    public void openBalgangadhartilak() {
        Intent intent = new Intent(this,Balgangadhartilak.class);
        startActivity(intent);
    }
    public void openSukhdev() {
        Intent intent = new Intent(this,Sukhdev.class);
        startActivity(intent);
    }
    public void openAnniebesant() {
        Intent intent = new Intent(this,Anniebesant.class);
        startActivity(intent);
    }
    public void openDadabhainaoroji() {
        Intent intent = new Intent(this,Dadabhainaoroji.class);
        startActivity(intent);
    }
    public void openBipinchandrapal() {
        Intent intent = new Intent(this,Bipinchandrapal.class);
        startActivity(intent);
    }
    public void openKmmunshi() {
        Intent intent = new Intent(this,Kmmunshi.class);
        startActivity(intent);
    }
    public void openSearchfromweb1() {
        Intent intent = new Intent(this,Searchfromweb1.class);
        startActivity(intent);
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
