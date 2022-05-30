package List接口和常用方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {

        /*
        添加 10 个以上的元素(比如 String "hello" ), 在 2 号位插入一个元素"韩顺平教育",
        获得第 5 个元素, 删除第 6 个元素, 修改第 7 个元素, 在使用迭代器遍历集合,
        要求: 使用 List 的实现类 ArrayList 完成。
        */

        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list = " + list);

        //在2号位插入一个元素 "zi.peng"
        list.add(1, "zi.peng");
        System.out.println("list = " + list);

        //获得第5个元素
        System.out.println("第五个元素 = " + list.get(4));

        //删除第6个元素
        list.remove(6);
        System.out.println("list = " + list);

        //修改第7个元素
        list.set(7, "三国演义");
        System.out.println("list = " + list);

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);

        }
    }
}
