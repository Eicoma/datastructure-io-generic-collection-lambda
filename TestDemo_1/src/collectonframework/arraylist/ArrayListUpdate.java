package collectonframework.arraylist;

import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        //修改
        sites.set(2,"Wiki");
        System.out.println(sites);
    }
}
