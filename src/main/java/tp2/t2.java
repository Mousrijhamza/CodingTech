package tp2;

import java.util.Scanner;

public class t2 {
    private int x;
    private int y;

    public t2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        t2 t = new t2(a,b);
        System.out.println(t.sum(a,b));
    }
}
