package com.builder_pattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {
    //1.定义容器存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();
    //2.加载配置文件
    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String)key);
                //通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee)clazz.newInstance();
                //向容器添加
                map.put((String)key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
