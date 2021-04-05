package datastructure.properties;

import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args){
        //Properties表示一个持久的属性集
        //其属性列表中的每个键和其对应值都是一个字符串
        Properties capitals = new Properties();
        Set states;
        String str;
        //Properties属性列表中的每个键和其对应值都是一个字符串
        capitals.put("Illinois","Springfield");
        capitals.put("Missouri","Jefferson City");
        capitals.put("Washington","Olympia");
        capitals.put("California","Sacramento");
        capitals.put("Indiana","Indianapolis");

        //show all states(州) and capitals in hashtable
        states = capitals.keySet();
        Iterator itr = states.iterator();
        while(itr.hasNext()){
            str = (String)itr.next();
            //String getProperty(String key)
            // 用指定的键在此属性列表中搜索属性。
            System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();

        //look for state not in list -- specify(指定)default
        //寻找键值不在属性列表中的属性（值）
        str = capitals.getProperty("Florida","Not Found");
        System.out.println("The capital of Florida is" + str + ".");
    }
}
