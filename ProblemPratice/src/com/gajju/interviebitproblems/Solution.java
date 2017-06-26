package com.gajju.interviebitproblems;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        int n=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array length:");
        try{
         n=Integer.parseInt(br.readLine());
        }catch(Exception e)
            {
            
        }
        int[] a=new int[n];
        System.out.println("Enter the array values:");
        for(int l=0;l<n;l++)
            {
            try{
            a[l]=Integer.parseInt(br.readLine());
            }catch(Exception e)
            {
            
        }
           }
        
        new Solution().reverse(a);
        
        
    }
    public void reverse(int  a[])
        {
        int[] b=new int[a.length];
        int k=0;
        for(int i=(a.length)-1;i>=0;i--)
            {
        if(a[i]<1 && a[i]>Math.pow(10,3))
            {
               System.out.println("please input a valid number:");
               return;
            }else
             {
                b[k++]=a[i];
             }
        }
        for(int h=0;h<a.length;h++)
            {
            System.out.print(b[h]+" ");
        }
    }
}