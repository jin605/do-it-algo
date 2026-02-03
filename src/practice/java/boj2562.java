package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int curNum = 0;
        int maxNum = 0;
        int count = 1;

        curNum = Integer.parseInt(br.readLine());
        maxNum = curNum;
        for (int i = 1; i < 9; i++) {
            curNum = Integer.parseInt(br.readLine());
            if(curNum > maxNum){
                maxNum = curNum;
                count = i+1;
            }
        }

        System.out.println(maxNum);
        System.out.println(count);



    }
}
