package com.gajju.java.gfg.probs;

public class TripletsSumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenSum=24;
		int sum=0;
		int [] array=new int[]{12,3,4,1,6,9};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				for(int k=0;k<array.length;k++)
				{
					sum=array[i]+array[j]+array[k];
					if(sum==givenSum)
					{
						System.out.println("Triplets is : "+array[i]+","+array[j]+","+array[k]);
						return;
					}
				}
			}
		}

	}

}
