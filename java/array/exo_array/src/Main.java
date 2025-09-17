import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int min(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; ++i) {
          if(arr[i] < min) {
              min = arr[i];
          }
        }

        return min;
    }

    public static int[] glissementVersLaDroite(int[] arr) {
        int tmp = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; --i) {
            arr[i] = arr[i - 1];
        }
        arr[0] = tmp;

        return arr;
    }

    public static int[] inverser(int[] arr) {
        for(int i = 0; i < arr.length / 2; ++i) {
            int tmp = arr[i];
            arr[i] = arr[arr.length -i - 1];
            arr[arr.length -i - 1] = tmp;
        }

        return arr;
    }

    public static int[] mergeSorted(int[] a, int[] b) {
        int n1 = (a == null) ? 0 : a.length;
        int n2 = (b == null) ? 0 : b.length;
        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // copier le reste de a s'il en reste
        while (i < n1) {
            result[k++] = a[i++];
        }

        // copier le reste de b s'il en reste
        while (j < n2) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static int[] concat(int[] arr, int[] arr2) {
        int[] arr3 = new int[arr.length + arr2.length];

        for(int i = 0; i < arr.length; ++i) {
            arr3[i] = arr[i];
        }

        for(int j = 0; j < arr2.length; ++j) {
            arr3[arr.length + j] = arr2[j];
        }

        return arr3;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        //   System.out.println("La plus petite valeur est :" + min(arr));
        //  System.out.println("Arrays: " + Arrays.toString(arr));
        //  System.out.println("Le tableau inversé est: " + Arrays.toString(inverser(arr)));
        //    System.out.println("Glissement vers la droite: " + Arrays.toString(glissementVersLaDroite(arr)));
        System.out.println("MergeSorted: " + Arrays.toString(mergeSorted(arr, arr2)));
        System.out.println("Concaténation: " + Arrays.toString(concat(arr, arr2)));
    }
}

