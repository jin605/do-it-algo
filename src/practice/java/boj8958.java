package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            int target = 0;
            int count = 0;

            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j)=='O'){
                    ++target;
                }
                else {
                    target = 0;
                }
                count += target;

            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
