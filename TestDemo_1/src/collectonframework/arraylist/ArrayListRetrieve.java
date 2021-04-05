package collectonframework.arraylist;

import java.util.ArrayList;

public class ArrayListRetrieve {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));
    }
}
