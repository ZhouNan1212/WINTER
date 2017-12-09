package com.zhounan.winter.db;

import org.litepal.crud.DataSupport;
/**
 * 创建时间：2017/12/9 15:59.
 * 作者：周楠
 */

public class Student extends DataSupport {

    private int id;

    private int age;

    private String name;

    private String sumScore;

    private String avgScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }
}
