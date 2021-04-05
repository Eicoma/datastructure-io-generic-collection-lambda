package generic.first;

public class GenericsMethodTest {
    //泛型方法 printArray
    public static <E> void printArray(E[] inputArray)
    {
        //输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        /*创建不同类型的数组：Integer,Double,Character
        类型参数（即E）只能是引用类型（类，对象引用）
        不能是基础数据类型（如int short long double char 等）
         */
            Integer[] intArray = {1,2,3,4,5};
            Double[] doubleArray = {1.1,1.3,1.5,6.6};
            Character[] charArray = {'W','E','L','C','O','M','E'};

            System.out.println("通过泛型方法打印整型类型的数组");
            printArray(intArray);
            System.out.println("-------------------------------------------------------");
            System.out.println("通过泛型方法打印浮点型的数组");
            printArray(doubleArray);
            System.out.println("-------------------------------------------------------");
            System.out.println("通过泛型方法打印字符型数组");
            printArray(charArray);
    }
}


