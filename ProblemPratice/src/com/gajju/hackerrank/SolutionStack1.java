package com.gajju.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionStack1 {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Long> st = new Stack<Long>();
        long max=0,max2=0;
        System.out.println("Enter the number:");
        System.out.println();
        int count=0;
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++)
            {
            String[] q1=br.readLine().split(" ");
            if(Integer.parseInt(q1[0])==1)
                {
                st.push(Long.parseLong(q1[1]));
                if(max<Long.parseLong(q1[1]))
                    {
                    max2=max;
                    max=Long.parseLong(q1[1]);
                    
                }
                if(max>Long.parseLong(q1[1]) )
                    {
                    if(max2<Long.parseLong(q1[1]))
                        {
                        max2=Long.parseLong(q1[1]);
                    }
                }
                //continue;
            }
            else if(Integer.parseInt(q1[0])==2)
                {
                if(st.isEmpty())
                    continue;
                long top=st.pop();
                if(top==max && (!st.isEmpty()))
                    max=max2;
                if(top==max && st.isEmpty())
                    {
                    max=0;
                    max2=0;
                }
                //continue;
            }
            else if(Integer.parseInt(q1[0])==3)
                {
                System.out.println(max);
                //continue;
            }
            count=count+1;
            if(count==3000 )
            	System.out.println("count="+count);
        }
    }
}