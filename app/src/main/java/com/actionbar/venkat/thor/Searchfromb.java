package com.actionbar.venkat.thor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Searchfromb extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchfromb);

        webView = (WebView) findViewById(R.id.webview2);

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.importantindia.com/19126/short-essay-on-life-of-a-farmer/");

        try{
            this.getSupportActionBar().hide();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();
        }


    }
}
