package com.gajju.ds.sortingnsearching;

public class BubleSort {

	public static void main(String[] args) {
		
		int[] array=new int[]{7,9,4,32,97,12,5};
		long startTime=System.nanoTime();
		
		int [] result=printBubleSort(array);
		System.out.println("algo time in nanosecond :"+(System.nanoTime()-startTime))
		;
		System.out.println("After Buble Sort:");

		for(int k=0;k<result.length;k++)
		{
		System.out.print(" "+result[k]);
		}
		System.out.println();
		//System.out.println("algo time in nanosecond :"+(System.nanoTime()-startTime));

	}

	private static int[] printBubleSort(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

}
