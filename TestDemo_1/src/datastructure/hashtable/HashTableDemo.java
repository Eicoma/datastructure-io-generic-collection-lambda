package datastructure.hashtable;

import java.util.*;

public class HashTableDemo {

    public static void main(String[] args){
        //创建一个hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        //Object put(Object key,Object value)将指定的键映射到哈希表中指定的值
        balance.put("Zara",new Double(3434.34));
        balance.put("Mahnaz",new Double(123.22));
        balance.put("Ayan",new Double(1378.00));
        balance.put("Daisy",new Double(99.22));
        balance.put("Qadir",new Double(-19.08));

        //show all balances in hash table
        //返回此哈希表中的键的枚举
        //names = balance.elements();  返回哈希表中值的枚举
        names = balance.keys();
        while(names.hasMoreElements()){
            str = (String)names.nextElement();
            //Object get(Object key)返回指定键所映射的值
            System.out.println(str + ":" + balance.get(str));
        }
        System.out.println();
        //Deposit(存款) 1000 into Zara's account
        //public double doubleValue() {
        //        return value;
        //}
        bal = ((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara",new Double(bal + 1000));
        //Object.get(key)获取键对应的值
        System.out.println("Zara's new balance:" + balance.get("Zara"));
    }
}
