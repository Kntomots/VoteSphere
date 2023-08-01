package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        WebView.setWebContentsDebuggingEnabled(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);



        webView.getSettings().setDomStorageEnabled(true);
        //webView.loadUrl("file:///android_asset/KILKIS.html");
    }
}