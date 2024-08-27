package Second_day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiConsumer;

public class t1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter Elements list :");
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while((br.readLine()) != null) {
            list.add(br.readLine());
//            BiConsumer<Integer, int[]> sumConsumer = (num, listqq) -> listqq[i] += num;
//            i++;
        }

//        list.forEach(z->System.out.println(z));
        for(String lis:list){
            System.out.println(lis);
        }

    }

    public static int sum(int a, int b){
        return a+b;
    }
}
