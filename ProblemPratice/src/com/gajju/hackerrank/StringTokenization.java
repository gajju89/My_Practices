package com.gajju.hackerrank;

import java.util.StringTokenizer;

public class StringTokenization {

	public static void main(String[] args) {
        
        String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug ";
        //scan.close();
        char[] s1=s.toCharArray();
        long count=0;

        // Write your code here.
    /*    for(long i=0L;i<s1.length;i++)
            {
        	 if(s1[(int) i]==' '||s1[(int) i]=='!'||s1[(int) i]==','||s1[(int) i]=='?'||s1[(int) i]=='.'||s1[(int) i]=='_'||s1[(int) i]=='\''||s1[(int) i]=='@')
             {
             if(!(i==s1.length-1) && (s1[(int) (i+1)]==' '||s1[(int) (i+1)]=='!'||s1[(int) (i+1)]==','||s1[(int) (i+1)]=='?'||s1[(int) (i+1)]=='.'||s1[(int) (i+1)]=='_'||s1[(int) (i+1)]=='\''||s1[(int) (i+1)]=='@'))
                 {
                 count=count+1;
                 i=i+1;
                 continue;
             }
             else
                 {
                 count=count+1;
             }
             
         }
        }
        System.out.println(count);*/
       /* String[] tokens = s.split("!,?._'@ ");
        for(int j=0;j<tokens.length;j++)
        {
        	System.out.println(tokens[j]);
        	System.out.println();
        }
        }*/
        StringTokenizer tok = new StringTokenizer(s, "!,?._'@ ");
        System.out.println(tok.countTokens());
        while(tok.hasMoreTokens())
        {
        	System.out.println(tok.nextToken());
        }
        
        }
    

}


