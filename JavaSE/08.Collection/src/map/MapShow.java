package map;

import java.util.*;

/**
 * Map接口遍历方式
 */
@SuppressWarnings({"all"})
public class MapShow {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", "mary");
        map.put("mike", "smith");
        map.put("james", "smith");
        map.put("lebron", null);
        map.put(null, "kelly");
        map.put("curry", "davis");
        //第一组：先取出所有的key，通过key取出对应的value
        //1.增强for
        Set keySet = map.keySet();//keySet()取键
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("---------------------");
        //2.迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("---------------------");

        //第二组：把所有的value取出
        Collection values = map.values();//values()取value
        //1.增强for
        for (Object value : values) {
            System.out.println(value);
        }

        System.out.println("---------------------");

        //2.迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println("value=" + value);
        }

        System.out.println("---------------------");

        //第三组：通过EntrySet
        Set set = map.entrySet();
        //1.增强for
        for (Object entry : set) {
            //将entry转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        System.out.println("---------------------");

        //2.迭代器
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            System.out.println(entry);
        }
    }
}
