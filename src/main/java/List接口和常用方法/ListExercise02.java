package List接口和常用方法;

import java.util.LinkedList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add(new Books("红楼梦", "曹雪芹", 100));
        list.add(new Books("西游记", "吴承恩", 10));
        list.add(new Books("水浒传", "施耐庵", 19));
        list.add(new Books("三国", "罗贯中", 80));

        //如何对集合进行排序

        for (Object o : list) {
            System.out.println(o);
        }

        //冒泡排序
        sort(list);
        System.out.println("====排序后====");
        for (Object o : list) {
            System.out.println(o);
        }

    }

    //静态方法
    //价格要求是从小到大
    public static void sort(List list) {

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                //取出对象 Book
                Books book1 = (Books) list.get(j);
                Books book2 = (Books) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }

    }

}

class Books {

    private String name;
    private String author;
    private double price;

    public Books(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
