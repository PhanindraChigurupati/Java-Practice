package p1;

public class classA {
    int a=100;
    public static void m1(){
        int Arr[] = {10, 20, 30,40,50};
        int b=200;
        for(int i : Arr ) {
            if(i==20) {
                break;
            }
            System.out.println(i);
        }
    }
}
