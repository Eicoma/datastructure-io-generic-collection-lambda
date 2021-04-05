package generic.first;

import java.util.*;

public class LeiXingTongPeiFu{

    /*
    private String dataName;
    private int  age;
    private double money;
    */


    public static void main(String[] args){
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> money = new ArrayList<Number>();

        name.add("Eicoma");
        age.add(21);
        money.add(15000);

        getData(name);
        getData(age);
        getData(money);
    }
    public static void getData(List<?> data){
        System.out.println("data:"+data.get(0));
    }
}
