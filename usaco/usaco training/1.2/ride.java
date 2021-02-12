
/*
ID: jl040221
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("ride.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("ride.out"));

        char[] comet = br.readLine().toCharArray();
        char[] group = br.readLine().toCharArray();

        int cometSum = 1;
        int groupSum = 1;

        for (int i = 0; i < comet.length; i++) {
            cometSum *= comet[i] - 'A' + 1;
        }
        for (int i = 0; i < group.length; i++) {
            groupSum *= group[i] - 'A' + 1;
        }
        if (cometSum % 47 == groupSum % 47) {
            pw.println("GO");
        } else {
            pw.println("STAY");
        }

        pw.close();
        br.close();

    }
}
