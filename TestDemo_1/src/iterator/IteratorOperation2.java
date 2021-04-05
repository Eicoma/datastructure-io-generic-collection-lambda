package iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class IteratorOperation2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        //该集合获取到该迭代器
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if (i >10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
