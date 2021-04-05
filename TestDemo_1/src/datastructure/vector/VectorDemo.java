package datastructure.vector;

import java.util.*;

public class VectorDemo {

    public static void main(String[] args){
        //初值为3，增量为2
        Vector v = new Vector(3,2);
        System.out.println("Initial size:" + v.size());
        //int capacity()
        //返回此向量的当前容量。
        System.out.println("Initial capacity:" + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("向量容器在经过四次增加后："+v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("当前的容量" + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("当前的容量" + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("当前的容量" + v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("第一个元素为" + (Integer)v.firstElement());
        System.out.println("最后一个元素为" + (Integer)v.lastElement());

        if (v.contains(new Integer(3)))
            System.out.println("Vector contains 3");

        Enumeration vEnum = v.elements();
        System.out.println("\n向量中的元素：");
        while(vEnum.hasMoreElements()){
            System.out.println(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
