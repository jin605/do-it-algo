package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] stu = new int[30];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = i+1;
        }

        int[] ex_stu = new int[28];
        for (int i = 0; i < ex_stu.length; i++) {
            ex_stu[i] = Integer.parseInt(br.readLine());
        }


        for (int i = 0; i < stu.length; i++){
            boolean found  = false;
            for (int j = 0; j < ex_stu.length; j++) {
                if (stu[i] == ex_stu[j]){
                    found = true;
                    break;
                }
            }

            if (!found){

                System.out.println(stu[i]);

            }
        }
    }
}
