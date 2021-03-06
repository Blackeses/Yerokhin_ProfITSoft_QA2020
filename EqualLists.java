import java.util.Arrays;
import java.util.Scanner;

public class EqualLists implements List {

    private static int size;
    int i;
    static int[] arr1;
    static int[] arr2;

    @Override
    public void List1(int[] arr1) {
        arr1 = new int[size];
        for (i = 0; i<size; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + " число в первом массиве: ");
            arr1[i] = in.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        EqualLists.arr1 = arr1;
    }

    @Override
    public void List2(int[] arr2) {
        arr2 = new int[size];
        for (i = 0; i<size; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + " число во втором массиве: ");
            arr2[i] = in.nextInt();
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        EqualLists.arr2 = arr2;
    }
    public static void EqualList(int[] arr1, int[] arr2) {
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Массивы эквивалентны");
        }
        else {
            System.out.println("Массивы не эквивалентны");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        size = in.nextInt();
        EqualLists L1 = new EqualLists();
        L1.List1(arr1);
        EqualLists L2 = new EqualLists();
        L2.List2(arr2);
        EqualList(arr1, arr2);
    }
}