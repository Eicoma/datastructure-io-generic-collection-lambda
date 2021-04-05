package collectonframework.hashset;

import java.util.HashSet;

public class HashSetOperation {
    public static void main(String[] args){
        HashSet<String> sites = new HashSet<>();
        //添加元素
        sites.add("Gooogle");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        //HashSet是一个不允许有重复元素的集合
        sites.add("Runoob");
        System.out.println(sites);
        //判断元素是否存在
        System.out.println("该元素存在吗：" + sites.contains("Taobao"));
        //删除元素
        sites.remove("Taobao");
        System.out.println(sites);
        //删除集合中的所有元素
        //sites.clear();
        //计算HashSet中的元素数量
        System.out.println(sites.size());
        //通过for-each循环迭代集合中的元素
        for (String i : sites){
            System.out.println(i);
        }
    }
}
