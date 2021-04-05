package collectonframework.arraylist;

import java.util.ArrayList;

public class ArrayListDelete {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3);
        System.out.println(sites);
    }
}
