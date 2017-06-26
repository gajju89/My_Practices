package com.gajju.ds.sortingnsearching;

public class SeslectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{7,9,4,32,97,12,5};
		int [] result=printSelectionSort(array);
		System.out.println("After Selection Sort:");
		for(int k=0;k<result.length;k++)
		{
		System.out.print(" "+result[k]);
		}

	}

	private static int[] printSelectionSort(int[] array) {
		// TODO Auto-generated method stub
	for(int i=0;i<array.length-1;i++)
	{
		int min=i;
		for(int j=i+1;j<array.length;j++)
		{
			if(array[j]<array[min])
			{
				min=j;
			}
		}
		if(min!=i)
		{
			int temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
	
	}
		return array;
	}

}
