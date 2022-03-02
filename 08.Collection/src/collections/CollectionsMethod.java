package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * 演示Collections工具类
 */

@SuppressWarnings({"all"})
public class CollectionsMethod {
    public static void main(String[] args) {
        //创建ArrayList集合，用于测试
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("jack");
        list.add("milan");

        //一、排序操作
        Collections.reverse(list);//反转
        System.out.println(list);
        Collections.shuffle(list);//随机排序
        System.out.println(list);
        Collections.sort(list);//根据元素的自然顺序对指定List集合元素按升序排序
        System.out.println(list);
        Collections.sort(list, new Comparator() {//指定排序规则
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(list);
        Collections.swap(list,1,3);//将指定list集合种的i处元素和j处元素进行交换
        System.out.println(list);


        //二、查找，替换
        System.out.println(Collections.max(list));//根据元素的自然顺序，返回给定集合中的最大元素
        //Object max(Collection,Comparator)	根据Comparator指向的顺序，返回给定集合中的最大元素
        //Object min(Collection)	根据元素的自然顺序，返回给定集合中的最小元素
        //Object min(Collection,Comparator)	根据Comparator指向的顺序，返回给定集合中的最小元素
        System.out.println(Collections.frequency(list,"smith"));//返回指定集合中指定元素的出现次数
        List list2 = new ArrayList();
        for (int i = 0; i < list.size() ; i++) {//必须进行此操作，否则会有越界异常
            list2.add("");
        }
        Collections.copy(list2,list);//void copy(List dest,List src),将src中的内容复制到dest中
        System.out.println(list2);
        //boolean replaceALL(List list,Object oldVal,Object newVal)	使用新值替换List对象的所有旧值
        Collections.replaceAll(list,"tom","james");
        System.out.println(list);
    }
}
