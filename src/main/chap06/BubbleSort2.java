package main.chap06;

import java.util.Scanner;

public class BubbleSort2 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++){
            int exchg = 0;
            for (int j = n-1; j > i; j--){
                if (a[j-1] > a[j]) {

                    swap(a,j-1, j);
                    exchg++;

                }

            }
            if (exchg == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블정렬(버전2)");
        System.out.print("요소수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int [nx];


        for (int i = 0; i < nx; i++){
            System.out.printf("x[%d] : ",i);
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x,nx);

        System.out.println("오름차순으로 정렬했습니다.");
        int count = 0;
        for (int i : x){
            System.out.printf("x[%d] : %d\n",count,i);
            count++;
        }



    }

}
