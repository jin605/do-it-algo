package practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort((s1,s2)-> {
            return s1-s2;
        });

        StringBuilder sb = new StringBuilder();
        for (int i : list){
            sb.append(i).append("\n");
        }

        System.out.println(sb);



    }
}
