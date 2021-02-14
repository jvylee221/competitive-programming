/*
ID: jl040221
LANG: JAVA
TASK: combo
*/

import java.util.*;
import java.io.*;

class combo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("combo.in"));
        PrintWriter out = new PrintWriter(new FileWriter("combo.out"));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        int[] combo1 = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < combo1.length; i++) {
            combo1[i] = Integer.parseInt(st.nextToken());
        }
        int[] combo2 = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < combo1.length; i++) {
            combo2[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(n);
        System.out.println(Arrays.toString(combo1));
        System.out.println(Arrays.toString(combo2));

        int temp1 = combo1[0] - 2;
        int temp12 = combo2[0] - 2;

        for (int first = 0; first < 5; first++) {
            temp1 = number(temp1, n);
            temp12 = number(temp12, n);
            
            int temp2 = combo1[1] - 2;
            int temp22 = combo2[1] - 2;

            for (int second = 0; second < 5; second++) {
                temp2 = number(temp2, n);
                temp22 = number(temp22, n);
                
                int temp3 = combo1[2] - 2;
                int temp32 = combo2[2] - 2;
                for (int third = 0; third < 5; third++) {
                    temp3 = number(temp3, n);
                    temp32 = number(temp32, n);
                

                    set.add(temp1 + " " + temp2 + " " + temp3);
                    set.add(temp12 + " " + temp22 + " " + temp32);
                    temp3++;
                    temp32++;
                }
                temp2++;
                temp22++;
                
            }
            temp1++;
            temp12++;
            
        }
        out.println(set.size());
        out.close();
    }

    public static int number(int temp1, int n){
        if(temp1 <= 0){
            temp1 = n + temp1;
            if(temp1 == 0){
                temp1 = 1;
            }
        }
        if(temp1 > n){
            temp1 = 1;
        }

        return temp1;
    }

}
