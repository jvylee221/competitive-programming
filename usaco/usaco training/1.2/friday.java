/*
ID: jl040221
LANG: JAVA
TASK: friday
*/

import java.util.*;
import java.io.*;

class friday {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new FileWriter("friday.out"));

        int N = Integer.parseInt(br.readLine());

        int[] days = new int[7];
        // s, s, m, t, w, t, f
        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int day = 1;

        for (int i = 1900; i < 1900 + N; i++) {
            for (int j = 0; j < months.length; j++) {
                days[(day + 13) % 7]++;
                if (j == 1 && isLeapYear(i) == true) {
                    day += 29;
                } else {
                    day += months[j];
                }
            }
        }
        for (int i = 0; i < days.length - 1; i++) {
            out.print(days[i] + " ");
        }
        out.println(days[days.length - 1]);
        out.close();

    }
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        if (year % 4 == 0)
            return true;
        return false;

    }
}
