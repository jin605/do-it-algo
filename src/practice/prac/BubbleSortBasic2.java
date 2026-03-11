package practice.prac;

import java.util.Scanner;

public class BubbleSortBasic2 {

    static void swap (int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a,int n) {
        for (int i = 0; i < n-1;i++) {
            for (int j = n-1; j > i; j--) {
                if (a[j-1] > a[j]) {
                    swap(a,j-1,j);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] : ",i);
            arr[i] = stdIn.nextInt();
        }

        bubbleSort(arr, n);

        System.out.println("오름차순으로 정렬했습니다.");
        int count = 0;
        for (int i : arr) {
            System.out.printf("arr[%d] : %d\n",count, i);
            count++;
        }



    }





}
