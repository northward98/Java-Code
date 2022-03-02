package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口常用方法
 */

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        //1.void add(int index, Object ele)：在index位置插入ele元素
        list.add(1, "james");
        System.out.println(list);
        //2.boolean addAll(int index, Collection eles)：从index位置将eles中的所有元素添加进来
        ArrayList list2 = new ArrayList();
        list2.add("jack");
        list2.add("mike");
        list.addAll(1, list2);
        System.out.println(list);
        //3.Object get(int index)：获取指定index位置的元素
        System.out.println(list.get(2));
        //4.int indexOf(Object obj)：返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("jack"));
        //5.int lastIndexOf(Object obj)：返回obj在集合中末次出现的位置
        list.add("mike");
        System.out.println(list.lastIndexOf("mike"));
        //6.Object remove(int index)：移除指定位置的元素，并返回此元素
        list.remove(0);
        System.out.println(list);
        //7.Object set(int index,Object ele)：设置指定index位置的元素为ele，相当于是替换
        list.set(2, "mary");
        System.out.println(list);
        //8.List subList(int fromIndex,int toIndex)：返回从fromIndex到toIndex位置的子集和
        System.out.println(list.subList(1, 3));//fromIndex <= x < toIndex
    }
}
