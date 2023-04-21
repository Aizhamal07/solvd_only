package practicalWithAndrei.homework1;


import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array!");
        int size= scan.nextInt();
        System.out.println("Now enter your numbers!");
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        if (arr.length > 1) {
            int middle = arr.length / 2;
            int[] left = new int[middle];
            int[] right = new int[arr.length - middle];
            for (int i = 0; i < middle; i++) {
                left[i] = arr[i];
            }
            for (int i = middle; i < arr.length; i++) {
                right[i - middle] = arr[i];
            }
            sort(left);
            sort(right);
            merge(arr, left, right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int l = 0, r = 0, a = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                arr[a++] = left[l++];
            } else {
                arr[a++] = right[r++];
            }
        }
        while (l < left.length) {
            arr[a++] = left[l++];
        }
        while (r < right.length) {
            arr[a++] = right[r++];
        }
    }




}