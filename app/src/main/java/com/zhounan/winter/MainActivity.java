package com.zhounan.winter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.loopeer.cardstack.AllMoveDownAnimatorAdapter;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.UpDownAnimatorAdapter;
import com.loopeer.cardstack.UpDownStackAnimatorAdapter;
import com.nightonke.boommenu.BoomMenuButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import jp.co.recruit_lifestyle.android.widget.WaveSwipeRefreshLayout;


public class MainActivity extends AppCompatActivity{

    //ListView控件
    private ListView mList;
    //ListView数据源
    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        mList = (ListView)findViewById(R.id.mList);
        for(int i = 0; i < 20; i ++){
            data.add("今天好手气" + i);
        }
        MyAdapter adapter = new MyAdapter(data);
        mList.setAdapter(adapter);
        //ListView item点击事件
        mList.setOnItemClickListener(new ListView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"我是item点击事件 i = " + i + "l = " + l, Toast.LENGTH_SHORT).show();
            }
        });


        //Button student = findViewById(R.id.student);
//        student.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                StudentActivity studentActivity = new StudentActivity();
//                studentActivity.requestStudent();
//            }
//        });

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
