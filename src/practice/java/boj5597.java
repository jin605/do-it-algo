package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[30];
        for (int i = 0; i < n.length; i++){
            n[i] = i+1;
        }
        int[] m = new int[28];
        for (int j = 0; j < m.length; j++){
            m[j] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n.length; i++){
            boolean isSame = false;
            for (int j = 0; j < m.length; j++){
                if (n[i] == m[j]){
                    isSame = true;
                    break;
                }
            }
            if (!isSame){
                System.out.println(n[i]);
            }
        }
    }
}
