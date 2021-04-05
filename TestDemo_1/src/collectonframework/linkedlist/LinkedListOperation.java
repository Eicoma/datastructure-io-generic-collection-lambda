package collectonframework.linkedlist;

import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String[] args){
        LinkedList<String> sites = new LinkedList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        //在头部添加元素
        sites.addFirst("Wiki");
        System.out.println(sites);
        //在尾部添加元素
        sites.addLast("Jingdong");
        System.out.println(sites);
        //移除头部元素
        sites.removeFirst();
        System.out.println(sites);
        //移除尾部元素
        sites.removeLast();
        System.out.println(sites);
        //获取头部元素
        System.out.println(sites.getFirst());
        //获取尾部元素
        System.out.println(sites.getLast());
        //通过for循环迭代列表中的元素
        for (int size = sites.size(),i = 0;i < size;i++){
            System.out.println(sites.get(i));
        }
        //通过for-each循环迭代列表中的元素
        for(String i : sites){
            System.out.println(i);
        }
    }
}
