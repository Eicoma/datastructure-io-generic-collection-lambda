package generic.first;

import java.util.*;

public class LXTPFShangXian {

    public static void main(String[] args){
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> money = new ArrayList<Number>();

        name.add("Eicoma");
        age.add(21);
        money.add(15000);

        //getUperNumber(name);
        //泛型为String不在getUperNumber()方法的范围内
        getUperNumber(age);
        getUperNumber(money);
    }
    public static void getUperNumber(List<? extends  Number> data){//该方法的参数限定了参数泛型上限为Number
        System.out.println("data:"+data.get(0));
    }
}
