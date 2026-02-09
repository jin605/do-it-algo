package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            String s = br.readLine();
            int r = (int) s.charAt(0)-'0';

            for (int j = 2; j < s.length(); j++){
                for (int k = 0; k < r; k++){
                    sb.append(s.charAt(j));
                }

            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
