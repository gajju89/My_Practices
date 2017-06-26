
public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
    	 for(int i=ar.length-2;i>=0;i--)
 		{
 			int key=ar[ar.length-1];
 			int j=i;
 			while(j>=0&&ar[j]>key)
 			{
 				ar[j+1]=ar[j];
                 for(int k=0;k<ar.length;k++)
                 {
                  System.out.print(" "+ar[k]);
                 }
                 System.out.println();
 				j=j-1;
 			}
 			ar[j+1]=key;	
 		}
		
    }
}
