package com.hart.htmlref;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String htmlpath;
        String fullpath = "file:///android_asset/";
        WebView mWebView;
        
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            
            AdView adView = (AdView)this.findViewById(R.id.adView);
            adView.loadAd(new AdRequest());

            mWebView = (WebView) findViewById(R.id.webview);
            mWebView.getSettings().setJavaScriptEnabled(true);
            // mWebView.loadUrl("file:///android_asset/Skill1/subject_area_03/024_031-503-1017.html");
            Bundle extras = getIntent().getExtras();
            htmlpath = extras != null ? extras.getString(main.web_classer)
									: null;
            System.out.println("webhtml =" + htmlpath);
            if(htmlpath != null && htmlpath != "")
            {
            	fullpath = fullpath + htmlpath;
            	mWebView.loadUrl(fullpath);
            }
            /*
            ImageView img = (ImageView)findViewById(R.id.adspace);
            img.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent advertise = new Intent();
                    advertise.setAction(Intent.ACTION_VIEW);
                    advertise.addCategory(Intent.CATEGORY_BROWSABLE);
                    advertise.setData(Uri.parse("http://leads.eandjmedia.com/devrymam.php"));
                    startActivity(advertise);
                }
            });
            */
        }
}