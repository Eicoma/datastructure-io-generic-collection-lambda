package collectonframework.HashMap;

import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args){
        //创建HashMap对象sites
        //HashMap的键和值可以为任意的引用类型（对象引用）
        HashMap<Integer,String> sites = new HashMap<>();
        //添加键值对
        sites.put(1,"Google");
        sites.put(2,"Runoob");
        sites.put(3,"Taobao");
        sites.put(4,"Zhihu");
        System.out.println(sites);
        //访问元素（HashMap通过gte(key)方法获取键对应的值）
        System.out.println(sites.get(3));
        //删除元素
        sites.remove(4);
        System.out.println(sites);
        //删除所有键值对
        //sites.clear();
        //计算HashMap中的元素数量
        System.out.println(sites.size());
        //通过for-each循环迭代HashMap中的元素
        //输出key和value
        for (Integer i : sites.keySet()){
            System.out.println("key:" + i + "value:" + sites.get(i) );
        }
        //只输出value
        for(String i : sites.values()){
            System.out.println("value:" + i);
        }
    }
}
