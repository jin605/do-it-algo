package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int minNum;
        int maxNum;

        st = new StringTokenizer(br.readLine());
        int curNum = Integer.parseInt(st.nextToken());
        minNum = curNum;
        maxNum = curNum;

        for (int i = 1; i < n ; i++) {
            curNum = Integer.parseInt(st.nextToken());

            if (minNum > curNum){
                minNum = curNum;
            }

            if (maxNum < curNum){
                maxNum = curNum;
            }
        }
            System.out.printf("%d %d",minNum,maxNum);

    }
}
