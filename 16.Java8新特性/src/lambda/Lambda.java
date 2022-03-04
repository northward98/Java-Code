package lambda;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;

public class Lambda {
    public static void main(String[] args) {

        //1. Runnable 接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The runable now is using!");
            }
        }).start();
        //用lambda
        new Thread(() -> System.out.println("It's a lambda function!")).start();

        //2. Comparator 接口
        List<Integer> strings = Arrays.asList(1, 2, 3);

        Collections.sort(strings, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;}
        });
        //Lambda
        Collections.sort(strings, (Integer o1, Integer o2) -> o1 - o2);
        //分解开
        Comparator<Integer> comperator = (Integer o1, Integer o2) -> o1 - o2;
        Collections.sort(strings, comperator);

        //3. Listener 接口
        JButton button = new JButton();
        button.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                e.getItem();
            }
        });
        //lambda
        button.addItemListener(e -> e.getItem());
    }

    //集合迭代
    public static void lamndaFor() {
        List<String> strings = Arrays.asList("1", "2", "3");
        //传统foreach
        for (String s : strings) {
            System.out.println(s);
        }
        //Lambda foreach
        strings.forEach((s) -> System.out.println(s));
        //or
        strings.forEach(System.out::println);
        //map
        Map<Integer, String> map = new HashMap<>();
        map.forEach((k,v)->System.out.println(v));
    }
}
