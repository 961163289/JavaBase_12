package Set接口实现类HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02 {
    public static void main(String[] args) {

        /*
        定义一个 Employee 类,该类包含: private 成员属性 name, sal, birthday(MyDate类型),
        其中 birthday 为 MyDate类型(属性包括: year, month, day)
        要求:
        1. 创建 3个 Employee 放入 HashSet 中
        2. 当 name 和 birthday 的值相同时,认为是相同员工,不能添加到 HashSet 集合中
        * */

        HashSet hashSet = new HashSet();
        hashSet.add(new Emp("jack", 18000, new MyData(1998, 9, 25)));
        hashSet.add(new Emp("milan", 18000, new MyData(1998, 9, 25)));
        hashSet.add(new Emp("jack", 18000, new MyData(1998, 9, 25)));

        //回答,加入了几个?  2个
        System.out.println("hashSet = " + hashSet);

    }
}

class Emp {
    private String name;
    private double sal;
    private MyData data;

    public Emp(String name, double sal, MyData data) {
        this.name = name;
        this.sal = sal;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyData getData() {
        return data;
    }

    public void setData(MyData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name) && Objects.equals(data, emp.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, data);
    }
}

class MyData {
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return year == myData.year && month == myData.month && day == myData.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
