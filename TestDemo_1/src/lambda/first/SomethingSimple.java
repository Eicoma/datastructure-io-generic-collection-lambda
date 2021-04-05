package lambda.first;

/**
 * 1.不需要参数，返回值为5
 * () -> 5
 * 2.接收一个参数，返回其2倍的值
 * x ->2*x
 * 3.接收2个参数，返回他们的差值
 * (x,y) -> x-y
 * 4.接收2个int型整数，返回他们的和
 * (int x, int y) -> x+y
 * 5.接收一个String对象，并在控制体打印，不返回任何值
 * (String s) -> System.out.print(s)
 */
public class SomethingSimple {
    public static void main(String[] args){
        SomethingSimple  simple = new SomethingSimple();
        /**
         * lambda表达式
         * 参数 -> 表达式
         */

        //使用类型声明
        MathOperation addition = (int a,int b) -> a+b;//这些lambda表达式实现了MathOperation接口的方法

        //不使用类型声明
        MathOperation subtraction = (a,b) -> a - b;

        //表达式使用返回语句和大括号
        MathOperation multiplication = (int a,int b) -> {return a*b;};

        //表达式不使用返回语句和大括号
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5=" + simple.operate(10,5,addition));
        System.out.println("10-5="+simple.operate(10,5,subtraction));
        System.out.println("10x5="+simple.operate(10,5,multiplication));
        System.out.println("10/5="+simple.operate(10,5,division));

        //使用括号
        GreetingService greetingService1 = (message) ->System.out.println("Hello"+message);

        //不使用括号
        GreetingService greetingService2 = message -> System.out.println("Hello"+message);

        greetingService1.sayMessage("Runoob");//GreetingService接口类型的变量直接调用该接口的方法
        greetingService2.sayMessage("Google");
       }
       interface MathOperation{
        int operation(int a,int b);//返回类型为int的接口中的方法
    }
    interface GreetingService{
        void sayMessage(String message);
    }
    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);//MathOperation接口类型的变量直接调用该接口的方法
    }
}
