package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] num = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());

            a[i] = num[i] % 42;
        }
        int count = 1;
        Arrays.sort(a);
        for ( int i = 0; i < a.length-1; i++){
            if (a[i] != a[i+1]){
                count++;
            }
        }
        System.out.println(count);






    }
}
