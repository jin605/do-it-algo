package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj3052_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[10];

        for (int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            a[i] = num % 42;
        }

        long result = Arrays.stream(a)
                .distinct()
                .count();

        System.out.println(result);

    }
}