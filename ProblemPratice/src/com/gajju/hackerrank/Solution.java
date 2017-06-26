package com.gajju.hackerrank;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
              int term1=0,term2=0;
           for(int j=0;j<n;j++)
            {
            term1=a+(int)Math.pow(b,j)*2;
            term2=term1+term2;
            System.out.print(" "+term2);
        }
            System.out.println("");
        }
      
        in.close();
    }
    // 0 2 10
}
