package Collections;

import java.util.*;

public class sample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of elements u want to enter: ");
        int n= sc.nextInt();
        List<Integer> l= new ArrayList<>();
        System.out.println("Enter ur values:");

        for(int i=1;i<=n;i++){
            int a =sc.nextInt();
            l.add(a);
        }
        System.out.println(l);
        try {
            System.out.println(l.get(6));
        }
        catch(IndexOutOfBoundsException a) {
            System.out.println("Exception: " + a.getMessage());
        }
        for(int i : l){
            System.out.println(i);
        }
    }
}
