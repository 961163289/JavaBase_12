package List接口和常用方法;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");

        //遍历
        //1. 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.print(obj + "\t");
        }

        //2. 增强for
        System.out.println("\n====增强 for====");
        for (Object obj : list) {
            System.out.print(obj + "\t");
        }

        //3. 普通for
        System.out.println("\n====普通 for====");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
}
