package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class MapInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        TextView toolbar_title = findViewById(R.id.toolbar_title);
        toolbar_title.setText("VoteSphere");

        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("file:///android_asset/Start_Menu.java")) {
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
        webView.loadUrl("file:///android_asset/index.html");
        ImageView leftButton = findViewById(R.id.left_icon);
        leftButton.setVisibility(View.INVISIBLE);



    }

}