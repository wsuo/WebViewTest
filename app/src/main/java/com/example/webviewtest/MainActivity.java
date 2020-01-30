package com.example.webviewtest;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);   //设置浏览器的属性,支持js脚本
        webView.setWebViewClient(new WebViewClient());  //需要从一个网页跳转到了另外一个网页时候,荣然在这里面显示
        webView.loadUrl("https://www.baidu.com");
    }
}
