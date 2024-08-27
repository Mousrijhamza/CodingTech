package Second_day;

import java.util.Scanner;
import java.util.ArrayList;

public class e1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien d'éléments souhaitez-vous entrer ? ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Entrez les éléments : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Élément " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }




        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }


        System.out.println("La somme des éléments est : " + sum);
        scanner.close();
    }
}
