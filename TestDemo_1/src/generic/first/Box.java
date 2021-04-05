package generic.first;

public class Box<T> {
    private T t;
    public void add(T t){//因为此处t为类型参数T类型（泛型类），所以此处的t应为一个对象（实例）
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(8));//add()的参数为对象
        stringBox.add(new String("泛型参数"));

        System.out.printf("整型值为：%d\n", integerBox.get());
        System.out.printf("字符串值为：%s\n",stringBox.get());
    }
}
