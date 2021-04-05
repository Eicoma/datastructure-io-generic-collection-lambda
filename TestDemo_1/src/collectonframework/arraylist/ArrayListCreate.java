package collectonframework.arraylist;

import java.util.ArrayList;

public class ArrayListCreate {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<>();
        //向ArrayList中添加元素
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
    }
}
