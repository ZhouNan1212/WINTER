package com.zhounan.winter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button student = findViewById(R.id.student);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentActivity studentActivity = new StudentActivity();
                studentActivity.requestStudent();
            }
        });

        /*
        WebView webView = (WebView) findViewById(R.id.web_view);
        // 使用findViewById获取WebView的实例
        webView.getSettings().setJavaScriptEnabled(true);
        // 调用WebView的getSettings方法设置浏览器的属性，
        // 这里调用setJavaScriptEnabled方法让WebView支持JavaScript脚本
        webView.setWebViewClient(new WebViewClient());
        // 调用setWebViewClient方法，传入一个WebViewClient实例
        // 这段的作用是当需要从一个网页跳转到另一个网页时，希望目标网页
        // 仍然在当前WebView中显示，而不是打开系统浏览器。
        webView.loadUrl("http://www.baidu.com");
        */
    }
}
