package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class openBroswer extends AppCompatActivity {
    private    String  link = "";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("link")) {
            link = intent.getStringExtra("link");
        }
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.clearCache(true);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);


        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("file:///android_asset/MainActivity2.java")) {
                    // Open the NewActivity when a specific link is clicked
                    startActivity(new Intent(getApplicationContext(), StartMenu.class));
                    return true; // Return true to prevent the link from loading in the WebView
                } else {
                    // Load other links in the WebView
                    view.loadUrl(url);
                    return false;
                }
            }
        });
        webView.loadUrl(link);
        ImageView rightButton = findViewById(R.id.right_icon);
        ImageView leftButton = findViewById(R.id.left_icon);
        leftButton.setVisibility(View.INVISIBLE);
        rightButton.setVisibility(View.INVISIBLE);



    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}