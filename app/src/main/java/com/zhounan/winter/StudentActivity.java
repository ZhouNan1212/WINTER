package com.zhounan.winter;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.zhounan.winter.gson.Student;
import com.zhounan.winter.util.HttpUtil;
import com.zhounan.winter.util.Utility;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * 创建时间：2017/12/9 17:33.
 * 作者：周楠
 */

public class StudentActivity extends AppCompatActivity {
    public void requestStudent() {
        String studentUrl = "http://192.168.0.101:8080/stu/list";
        HttpUtil.sendOkHttpRequest(studentUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(StudentActivity.this,
                                          "获取Student失败",
                                          Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final List<Student> studentList = Utility.handleStudentResponse(responseText);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (studentList != null) {
                            showStudentInfo(studentList);
                        } else {
                            Toast.makeText(StudentActivity.this, "获取Student失败", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        });

    }

    private void showStudentInfo(List<Student> studentList) {
        for (Student student: studentList) {
            Log.d("student", "ID is" + student.studentID);
            Log.d("student", "Name is" + student.name);
            Log.d("student", "Age is" + student.age);
            Log.d("student", "Sum of scores is" + student.sumScore);
            Log.d("student", "Avg of scores is" + student.avgScore);
        }
    }





}
