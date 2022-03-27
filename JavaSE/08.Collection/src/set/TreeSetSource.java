package set;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class TreeSetSource {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {//需调用此构造器才会排序，调用无参构造器不会排序
            //TreeMap同样要使用此构造器才会排序
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
                //看底层源码，按a-z顺序排，若o2.compareTo(o1),则按z-a排列
            }
        });

        treeSet.add("jack");
        treeSet.add("smith");
        treeSet.add("abc");
        treeSet.add("d");

        System.out.println(treeSet);
    }
}
