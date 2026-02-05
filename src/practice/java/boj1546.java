package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        double[] arr = new double[m];
        double maxArr = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (maxArr <= arr[i]) {
                maxArr = arr[i];
            }
        }

        double total = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]/maxArr*100;
            total += arr[i];
        }

        double avg = (double) total/arr.length;
        System.out.printf("%.2f",avg);










    }
}
