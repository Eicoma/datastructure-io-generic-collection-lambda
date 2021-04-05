package generic.first;

public class MaximumTest {
    //比较三个值并返回最大值
    public static <T extends Comparable<T>>T maximum(T x,T y,T z)
    {
        T max = x;//创建一个泛型类型的变量max,假设x为最大值
        if (y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("打印出下列整数中的最大值：");
        System.out.printf("%d,%d,%d中的最大值为%d\n",1,2,3,maximum(1,2,3));
        System.out.println("-------------------------------------------------------");
        System.out.println("打印出下列浮点型值中的最大值：");
        System.out.printf("%.1f,%.1f,%.1f中的最大值为%.1f\n",2.3,1.4,3.5,maximum(2.3,1.4,3.5));
        System.out.println("-------------------------------------------------------");
        System.out.println("打印出下列字符串中的最大值：");
        System.out.printf("%s,%s,%s中的最大值为%s","apple","pineapple","orange",maximum("apple","pineapple","orange"));
    }
}
