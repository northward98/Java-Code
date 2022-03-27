package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 演示集合遍历
 */

public class CollectionShow {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //方式一：迭代器遍历
        Iterator iterator = col.iterator();//得到一个迭代器
        while (iterator.hasNext()) {//快捷键  itit
            Object n = iterator.next();
            System.out.println(n);
        }
        //注意事项
        //1.当退出while循环后，这时iterator迭代器，指向最后的元素
        //2.如果希望再次遍历，重置迭代器
        //iterator = col.iterator();

        System.out.println("-----------------------------------------------");

        //增强for遍历，底层仍然是迭代器
        for (Object book :col) {
            System.out.println(book);
        }

    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
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