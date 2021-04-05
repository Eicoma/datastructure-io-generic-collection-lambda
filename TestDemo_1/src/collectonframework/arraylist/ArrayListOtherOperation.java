package collectonframework.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOtherOperation {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        //计算ArrayList中元素数量
        System.out.println(sites.size());
        //迭代数组列表
        //通过for迭代
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
        //通过for-each来迭代
        for(String i : sites ){
            System.out.println(i);
        }
        //排序
        Collections.sort(sites);
        for(String i : sites){
            System.out.println(i);
        }
    }
}