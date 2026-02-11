package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] bucket = new int[m];
        for (int i = 0; i < m; i++){
            bucket[i] = i + 1;
        }

        for (int j = 0; j < n; j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            if (a > b){
                int temp = a;
                a = b;
                b = temp;
            }

            for (int k = 0; k <= (b-a) /2; k++){
                int temp = bucket[a+k];
                bucket[a+k] = bucket[b-k];
                bucket[b-k] = temp;
            }
        }

        for (int k : bucket){
            System.out.print(k + " ");
        }

    }
}
