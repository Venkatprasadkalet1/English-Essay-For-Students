package com.actionbar.venkat.thor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Searchfw extends AppCompatActivity {
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchfw);

        webView = (WebView) findViewById(R.id.webview3);

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://search.1and1.com/find?q=essay+for+environment&ae=10000&at=4&lang=en&mkt=in&origin=32&mty=b&kwd=essay+for+environment&net=g&cre=116621249705&pla&device=c&devicem&mob&sou=s&adp=1t1&kwid=kwd-35771901885&agid=16998638465&cid=206152025&eid&loci&locp=21334&vt=1&gclid=Cj0KCQjwxtPYBRD6ARIsAKs1XJ62EJ4riKo_8KGV70OZYEdCNz1VQYjd0IhhnI4cstCHGGuIQdym0VIaAqanEALw_wcB");

        try{
            this.getSupportActionBar().hide();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();
        }


    }
}
