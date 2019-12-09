package a1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String[] args) throws IOException {
// System.out.println("GfG!");


//input format :a b

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
//Only valid for number range from 0-10^5;
        int ar[] = new int[100000];
        int ans[] = new int[10];
        int c = 0;
        int start = Integer.parseInt(s[0]);
        int end = Integer.parseInt(s[1]);
        int range = end - start + 1;//copied from gfg
        while (c < 10) {
            //only for 10 elements

            int rand = (int) (Math.random() * range) + start;//copied from gfg;
            if (ar[rand] == 0) {
                ans[c++] = rand;//store answer value
                ar[rand]++; //working as a flag;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(ans[i] + " ");

            //this process may take time for n and end-start=n due to repeatation of values but still working
            //in 1 sec for n=1000;

        }

    }
}
