package p1;
public class A {
    private int p = 100;
    public void a1() {
        System.out.println(p);
    }
    public void a1(int i) {
        System.out.println(i);
    }
    public void a1(float i) {
        System.out.println(i);
    }
}
class B extends A{
    public void a1() {
        System.out.println("in B");
    }
}
class Test{
    public static void main(String[] args) {
        B obj =new B();
        obj.a1();
    }
}
