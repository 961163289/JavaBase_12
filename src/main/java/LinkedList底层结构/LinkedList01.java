package LinkedList底层结构;

public class LinkedList01 {
    public static void main(String[] args) {

        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");

        //连接三个节点,形成双向链表
        //jack -> tom -> hsp
        jack.next = tom;
        tom.next = hsp;
        //jack -> tom -> hsp
        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack; //让first引用指向jack,就是双向链表的头结点
        Node last = hsp;   //让last引用指向hsp,就是双向链表的尾节点

        //演示,从头到尾进行遍历
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示,从尾到头进行遍历
        System.out.println("===从尾到头进行遍历===");
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }

        //演示链表的添加对象/数据,是多么的方便
        //要求,是在 tom 后 插入一个对象 smith
        //1. 先创建一个 Node节点, name 就是 smith
        Node smith = new Node("smith");
        //下面就把 smith 加入到双向链表了
        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;

        //让 first 再次指向 jack
        first = jack; //让first引用指向jack,就是双向链表的头结点

        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
        //让 last 再次指向 hsp
        last = hsp;   //让last引用指向hsp,就是双向链表的尾节点

        System.out.println("===从尾到头进行遍历===");
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }

    }
}

//定义一个 Node类, Node对象, 表示双向链表的一个节点
class Node {
    public Object item; //真正存放数据
    public Node next;   //指向后一个节点
    public Node pre;    //指向前一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
