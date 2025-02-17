package Streams;

import java.util.*;

public class sample {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("phani","ntr","Dhoni");
        long a = l.stream().count();
        System.out.println(a);
        l.stream().forEach(System.out::println);
        l.stream().sorted().forEach(System.out::println);
        l.stream().filter(l1->l1.startsWith("n")).forEach(System.out::println);
        l.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
