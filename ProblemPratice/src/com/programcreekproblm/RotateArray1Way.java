package com.programcreekproblm;

public class RotateArray1Way {
	
	public void rotateArray(int num[],int k)
	{
		int[] result=new int[num.length];
		int l=num.length-k;
		for(int i=0;i<k;i++)
		{
			result[i]=num[num.length-k+i];
		}
		int i=0;
		for(int j=k;j<num.length;j++)
		{
			result[j]=num[i];i++;
		}
		System.arraycopy( result, 0, num, 0, num.length );
		for(int a:num)
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hello={1,2,3,4,5,6,7};
		RotateArray1Way one=new RotateArray1Way();
		one.rotateArray(hello, 3);
		
	}

}
