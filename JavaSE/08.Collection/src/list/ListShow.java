package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List遍历
 */

public class ListShow {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mike");
        list.add("mary");

        //第一种
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);

        }

        System.out.println("--------------------");

        //第二种
        for (Object o :list) {
            System.out.print(o + "\t");
        }
        System.out.println();

        System.out.println("--------------------");

        //第三种
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
}
