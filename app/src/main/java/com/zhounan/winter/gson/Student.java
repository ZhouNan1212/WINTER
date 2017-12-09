package com.zhounan.winter.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间：2017/12/9 16:36.
 * 作者：周楠
 */

public class Student {

    @SerializedName("id")
    public int studentID;

    public int age;

    public String name;

    public String sumScore;

    public String avgScore;

}
