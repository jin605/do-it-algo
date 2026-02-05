package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;

public class boj10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (b < a){
                int temp = a;
                a = b;
                b = temp;
            }

            for(int j = a - 1; j <= (b-a)/2; j++ ){
                int temp = arr[a+j];
                arr[a+j] = arr[b-j-1];
                arr[b-j-1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}
