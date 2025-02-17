package Lambda;

class sample2 {
    @FunctionalInterface
    public interface abc {
        public void show();
    }
    @FunctionalInterface
    interface abcd {
        public int show(int a, int b);
    }
}
public class sample extends sample2 {
    public static void main(String[] args) {
        abc obj1 =()->System.out.println("hello");
        abcd obj2 =(int a,int b)-> a+b;
        obj1.show();
        int result = obj2.show(2,3);
        System.out.println(result);
    }
}
