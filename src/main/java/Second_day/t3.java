package Second_day;

public class t3 {
    public static void main(String[] args) {
        int[] source_array = {1, 2, 3, 4, 5, 6, 7};
        int target_position = 2;

        // Convertir le tableau en liste
//        List<Integer> tab = new ArrayList<>();
//        for (int num : source_array) {
//            tab.add(num);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the target_position");
//        target_position = sc.nextInt();
//

//        if (target_position < 0 || target_position >= tab.size()) {
//            System.out.println("Position invalide.");
//            return;
//        }
//
//        // Déplacement des éléments
//        for (int i = 0; i < target_position; i++) {
//            int ed = tab.get(i);
//            tab.add(ed);
//            tab.remove(i);
//        }
//
//        // Affichage des résultats
//        tab.forEach(x -> System.out.print(x+", "));
//        sc.close();
        int i=0;
        int cache=0;
        int[] cach = new int[target_position];

        for (int k = 0; k < target_position ; k++) {
            cach[k]=source_array[k];
            System.out.println(cach[k]);
        }
        for (int j = target_position; j <source_array.length ; j++, i++) {
            source_array[i] = source_array[j];
            if ( j == source_array.length-1){
                for (int z = j-target_position+1; z < source_array.length; z++) {
                    source_array[z]=cach[cache++];
                }
            }
        }

        for (int k = 0; k < source_array.length; k++) {
            System.out.print(source_array[k]+", ");
        }

    }
}
