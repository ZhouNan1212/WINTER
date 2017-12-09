package com.zhounan.winter.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhounan.winter.gson.Student;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * 创建时间：2017/12/9 16:59.
 * 作者：周楠
 */

public class Utility {

    public static List<Student> handleStudentResponse(String response) {
        try {
            Gson gson = new Gson();
            //解析一段json数组
            return gson.fromJson(response, new TypeToken<List<Student>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
