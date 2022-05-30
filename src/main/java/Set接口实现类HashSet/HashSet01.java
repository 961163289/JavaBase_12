package Set接口实现类HashSet;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        //说明
        //1. 在执行 add方法后,会返回一个 boolean值
        //2. 如果添加成功,返回 true,否则返回 false
        //3. 可以通过 remove指定删除哪个对象
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T
        System.out.println(set.add(null));  //T
        System.out.println(set.add(null));  //F

        set.remove("john");
        System.out.println("set = " + set);//4个

        set = new HashSet();
        System.out.println("set = " + set);//0个

        //4. HashSet 不能添加相同的元素/数据?
        set.add("luck");//添加成功
        set.add("luck");//加入不了
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//OK

        System.out.println("set = " + set);

        //在加深一下. 非常经典的面试题
        //看源码，做分析， 先给小伙伴留一个坑，以后讲完源码，你就了然
        //去看他的源码，即 add 到底发生了什么?=> 底层机制
        set.add(new String("hsp"));
        set.add(new String("hsp"));
        System.out.println("set = " + set);
    }
}

//定义了 Dog类
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
