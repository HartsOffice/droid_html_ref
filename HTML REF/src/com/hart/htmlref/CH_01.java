package com.hart.htmlref;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class CH_01 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView mWebView;
        
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            mWebView = (WebView) findViewById(R.id.webview);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.loadUrl("file:///android_asset/HTML_Ref/01_Basics.html");
        }
}

