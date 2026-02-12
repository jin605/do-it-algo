package main.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);

        System.out.print("요솟수 : ");


        int num = stdId.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");
        x[0] = stdId.nextInt();



        for (int i = 1; i < num; i++) {

            do {

                System.out.printf("x[%d] : ",i);
                x[i] = stdId.nextInt();

            } while (x[i] < x[i -1]);

        }

        System.out.print("검색할 값 : ");
        int ky = stdId.nextInt();

        int idx = Arrays.binarySearch(x,ky);

        if (idx < 0){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.printf("그 값은 x[%d]에 있습니다.", idx);

        }




    }

}
