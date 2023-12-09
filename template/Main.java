/*
ID: your_id_here
LANG: JAVA
TASK: template
*/

import java.io.*;
import java.util.*;

class Main {
    /* Terminal I/O */
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());
        System.out.println(i1+i2);
    }

    // /* File I/O */
    // public static void main (String [] args) throws IOException {
    //     BufferedReader f = new BufferedReader(new FileReader("00.in"));
    //     PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("00.out.actual")));

    //     StringTokenizer st = new StringTokenizer(f.readLine());

    //     int i1 = Integer.parseInt(st.nextToken());
    //     int i2 = Integer.parseInt(st.nextToken());
    //     out.println(i1+i2);

    //     out.close();
    // }
}