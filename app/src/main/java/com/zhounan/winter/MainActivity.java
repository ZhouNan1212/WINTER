package com.zhounan.winter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.loopeer.cardstack.AllMoveDownAnimatorAdapter;
import com.loopeer.cardstack.CardStackView;
import com.loopeer.cardstack.UpDownAnimatorAdapter;
import com.loopeer.cardstack.UpDownStackAnimatorAdapter;
import com.nightonke.boommenu.BoomMenuButton;

import java.util.Arrays;


import jp.co.recruit_lifestyle.android.widget.WaveSwipeRefreshLayout;


public class MainActivity extends AppCompatActivity implements CardStackView.ItemExpendListener {

    public static Integer[] TEST_DATAS = new Integer[]{
            R.color.color_1,
            R.color.color_2,
            R.color.color_3,
            R.color.color_4,
            R.color.color_5,
            R.color.color_6,
            R.color.color_7,
            R.color.color_8,
            R.color.color_9,
            R.color.color_10,
            R.color.color_11,
            R.color.color_12,
            R.color.color_13,
            R.color.color_14,
            R.color.color_15,
            R.color.color_16,
            R.color.color_17,
            R.color.color_18,
            R.color.color_19,
            R.color.color_20,
            R.color.color_21,
            R.color.color_22,
            R.color.color_23,
            R.color.color_24,
            R.color.color_25,
            R.color.color_26
    };
    private CardStackView mStackView;
    private LinearLayout mActionButtonContainer;
    private TestStackAdapter mTestStackAdapter;
    private WaveSwipeRefreshLayout mWaveSwipeRefreshLayout;
    private BoomMenuButton boomMenuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStackView = (CardStackView) findViewById(R.id.winter_stackview_main);
        mActionButtonContainer = (LinearLayout) findViewById(R.id.winter_button_container);
        mTestStackAdapter = new TestStackAdapter(this);
        mStackView.setAdapter(mTestStackAdapter);
        mTestStackAdapter.updateData(Arrays.asList(TEST_DATAS));

        new Handler().postDelayed(
                //实际上也就实现了一个0.2s的一个定时器
                new Runnable() {
                    @Override
                    public void run() {
                        mTestStackAdapter.updateData(Arrays.asList(TEST_DATAS));
                    }
                }
                , 200
        );


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //创建菜单
        getMenuInflater().inflate(R.menu.winter_menu_actions, // 要加载的布局文件的ID;
                menu); //要填充的菜单
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.MENU_ALL_DOWN:
                mStackView.setAnimatorAdapter(new AllMoveDownAnimatorAdapter(mStackView));
                break;
            case R.id.MENU_UP_DOWN:
                mStackView.setAnimatorAdapter(new UpDownAnimatorAdapter(mStackView));
                break;
            case R.id.MENU_UP_DOWN_STACK:
                mStackView.setAnimatorAdapter(new UpDownStackAnimatorAdapter(mStackView));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemExpend(boolean expend) {
        mActionButtonContainer.setVisibility(expend ? View.VISIBLE : View.GONE);
    }

    public void onPreClick(View view) {
        mStackView.pre();
    }

    public void onNextClick(View view) {
        mStackView.next();
    }

}
