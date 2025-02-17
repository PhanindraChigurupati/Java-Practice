package Strings;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Enter your STRING: ");
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println("Your String: "+ name);
        System.out.println("Pick one: 1)Length 2)FindIndex 3)ConvertUpper 4)palindrome 5)split 6)reverse");
        int n=sc.nextInt();
        switch(n) {
            case 1:
                length(name);
                break;
            case 2:
                FindIndex(name);
                break;
            case 3:
                upper(name);
                break;
            case 4:
                palindrome(name);
                break;
            case 5:
                split(name);
                break;
            case 6:
                reverse(name);
                break;
        }
    }
    public static void length(String name){
        System.out.println(name.length());
    }
    public static void FindIndex(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("your char: ");
        String a= sc.next();
        System.out.println(name.indexOf(a));
    }
    public static void upper(String name) {
        System.out.println(name.toUpperCase());
    }
    public static void palindrome(String name){
        String result="";
        for(int i=0;i<name.length();i++){
            result =name.charAt(i)+result;
        }
        System.out.println(result);
        if(name.equals(result))
            System.out.println("Yes its a palindrome!!!!!!!!!!");
        else
            System.out.println("its a not a palindrome############");
    }
    public static void split(String name){

        String[] words = name.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void reverse(String name){
        String result="";
        for(int i=0;i<name.length();i++){
            result =name.charAt(i)+result;
        }
        System.out.println(result);
    }
}


