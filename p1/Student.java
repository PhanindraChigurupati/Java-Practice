package p1;
import java.util.Scanner;
public class Student {
    String name="phani";
    public int rollno;
    int sub;
    private int marks[];

    public int add(int a,int b){
        return a+b;
    }
    protected static int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    private int add(int a) {
        return a;
    }
//    public void SetArr() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no of subjects:");
//        sub = sc.nextInt();
//        marks = new int[sub];
//        System.out.println("Enter your marks");
//        for (int i = 0; i < sub; i++) {
//            marks[i] = sc.nextInt();
//        }
//    }
//    public void hello(){
//        System.out.println("Hello");
//    }
//
//    public void GetArr(){
//            System.out.println("Here is your values");
//            for (int i = 0; i < sub; i++) {
//                System.out.println(marks[i]);
//            }
//    }
}
