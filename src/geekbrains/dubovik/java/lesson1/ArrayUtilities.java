package geekbrains.dubovik.java.lesson1;

import java.util.ArrayList;

public class ArrayUtilities {

    public static void main(String[] args) {
        String[] f1champ2020 = new String[]{
                "Mercedes", "Red Bull", "McLaren", "Racing Point", "Renault", "Ferrari", "AlphaTauri", "Alfa Romeo", "Haas", "Williams"
        };
        Integer[] f1point2020 = new Integer[]{
                573, 319, 202, 195, 181, 131, 107, 8, 3, 0
        };

        System.out.println(arrayToList(f1champ2020));
        System.out.println(arrayToList(f1point2020));

        replaceElements(f1champ2020, 0, 5);
        replaceElements(f1point2020, 0, 5);

        System.out.println(arrayToList(f1champ2020));
        System.out.println(arrayToList(f1point2020));
    }

    static <T> void replaceElements (T arr[], int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static <T> ArrayList<T> arrayToList (T arr[]) {
        ArrayList<T> res = new ArrayList<>(arr.length);
        for (T item : arr) {
            res.add(item);
        }
        return res;
    }
}
