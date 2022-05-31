package Collections工具类;

import java.util.*;

@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {

        //创建 ArrayList 集合,用于测试
        List list = new ArrayList();

        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        System.out.println("list = " + list);

        //reverse(list)  反转 List 中元素的顺序
//        Collections.reverse(list);
//        System.out.println("list = " + list);

        //shuffle(list) 对 List 集合元素进行随机排序
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(list);
//            System.out.println("list = " + list);
//        }

        //sort(list) 根据元素的自然顺序对指定 List 集合元素按升序排序
//        Collections.sort(list);
//        System.out.println("list = " + list);

        //sort(list, Comparator) 根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        //我们希望按照 字符串的长度大小进行排序
//        Collections.sort(list, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                //可以加入校验代码
//                return ((String) o2).length() - ((String) o1).length();
//            }
//        });
//        System.out.println("list = " + list);

        //swap(list, int, int) 将指定 list 集合中的 i处元素 和 j处元素 进行交换
//        Collections.swap(list,0,1);
//        System.out.println("list = " + list);

        //Object max(Collection) 根据元素的自然顺序,返回给定集合中的最大元素
        System.out.println(Collections.max(list));

        //Object max(Collection, Comparator)  根据 Comparator 指定的顺序,返回给定集合中的最大元素
        //比如,我们要返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(maxObject);

        //Object min(Collection)
        //Object min(Collection, Comparator)
        //上面的两个方法,参考 max即可

        //Collections.frequency(Collection, Object) 返回指定集合中指定元素的出现次数
        System.out.println("tom 出现的次数 = " + Collections.frequency(list, "tom"));

        //void copy(List desc, List src) 将 src 中的内容复制到 dest 中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝,我们需要先给 dest 赋值,大小和 list.size() 一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //拷贝
        Collections.copy(dest, list);
        System.out.println("dest = " + dest);

        //boolean replaceAll(List list, Object oldVal, Object newVal)  使用新值替换 List 对象的所有旧值
        //如果 list 中,有 tom 就替换成 汤姆
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println("list 替换后 = " + list);

    }
}
