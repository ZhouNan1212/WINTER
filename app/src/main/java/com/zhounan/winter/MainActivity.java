package com.zhounan.winter;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.BinderThread;
import android.support.transition.TransitionSet;
import android.support.transition.TransitionManager;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.support.transition.AutoTransition;

import butterknife.*;
import butterknife.ButterKnife;


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

//        Button designatedStudent = findViewById(R.id.submit_id);
//        //用EditText前，请先:import android.widget.EditText;
//        //获取文本框1的文本
//        designatedStudent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                EditText editText1 = findViewById(R.id.student_id);
//                final String id = editText1.getText().toString();
//                Log.d("学生id", id);
//                StudentActivity studentActivity = new StudentActivity();
//                studentActivity.requestDesignatedStudent(id);
//            }
//        });
//
//        Button machineLearning = findViewById(R.id.content_label);
//        //用EditText前，请先:import android.widget.EditText;
//        //获取文本框1的文本
//        machineLearning.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                StudentActivity studentActivity = new StudentActivity();
//                studentActivity.requestAllLabel();
//            }
//        });

        /*
        WebView webView = (WebView) findViewById(R.id.web_view);-
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
