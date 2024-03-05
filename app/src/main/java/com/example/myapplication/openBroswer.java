package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

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
        if (isConnectedToInternet()) {
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
            ImageView leftButton = findViewById(R.id.left_icon);
            leftButton.setVisibility(View.INVISIBLE);
        }
        else {
                // No internet connection, display a toast message
                Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
                finish(); // Finish the activity
            }




    }
    public boolean isConnectedToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
