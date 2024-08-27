package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exe1 {
    public static void main(String[] args) {

        String [] list =
        new String[]{"Sortie attendue", "Hello", "Alexandra Abramov"};

        Iterator<String> iterator= Arrays.stream(list).iterator();
        while(iterator.hasNext()){
//            (iterator.next()) ->{
//                System.out.println(iterator.next());
//            )}
            System.out.println(iterator.next());
        }

    }
}
