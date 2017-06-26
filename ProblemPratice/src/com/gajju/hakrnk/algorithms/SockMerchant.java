package com.gajju.hakrnk.algorithms;

import java.util.Scanner;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int result=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j]&& ar[i]>0 && ar[j]>0)
                {
                    result=result+1;
                    ar[i]=ar[j]=0;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
