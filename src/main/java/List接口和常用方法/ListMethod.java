package List接口和常用方法;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        //void add(int index, E element); //在 index 位置插入 element元素
        //在 index = 1 的位置插入一个对象
        list.add(1, "韩顺平");
        System.out.println(list);

        //boolean addAll(int index, Collection<? extends E> c); 从 index 位置开始将 c 中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println(list);

        //E get(int index); 获取指定 index 位置的元素
        System.out.println(list.get(0));//张三丰

        //int indexOf(Object obj); 返回 obj在当前集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//2

        //int lastIndexOf(Object obj); 返回 obj在当前集合中末次出现的位置
        list.add("韩顺平");
        System.out.println(list);
        System.out.println(list.lastIndexOf("韩顺平"));//2

        //E remove(int index); 移除指定 index位置的元素,并返回此元素
        System.out.println(list.remove(0));
        System.out.println("list = " + list);

        //E set(int index, E element); 设置指定 index位置的元素 element,相当于是替换
        list.set(1, "玛丽");
        System.out.println("list = " + list);

        //List<E> subList(int fromIndex, int toIndex); 返回从 fromIndex 到 toIndex 位置的子集合
        //注意返回的子集合 fromIndex <= subList < toIndex
        List returnlist = list.subList(0, 2);
        System.out.println("returnlist = " + returnlist);

    }
}
