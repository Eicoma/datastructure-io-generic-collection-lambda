package datastructure.stack;

import java.util.*;

public class StackDemo {

    static void showPush(Stack<Integer> st,int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack:" + st);
    }

    static void showPop(Stack<Integer> st){
        System.out.print("pop ->");
        Integer a = (Integer)st.pop();//出栈再赋给a
        System.out.println(a);
        System.out.println("stack:" + st);
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack:" + st);
        showPush(st,42);
        showPush(st,66);
        showPush(st,99);
        showPop(st);
        showPop(st);
        showPop(st);
        //体现了栈先入后出的特点
        try {
            showPop(st);
        }catch(EmptyStackException e){
            System.out.println("该栈已空");
        }
    }
}
