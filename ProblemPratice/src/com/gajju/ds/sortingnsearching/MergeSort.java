package com.gajju.ds.sortingnsearching;

public class MergeSort {
	static int[] finalArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{7,9,4,32,97,12,5};
		finalArray=new int[array.length];
		printMergeSort(array);
		System.out.println("After Merge Sort:");
		for(int k=0;k<finalArray.length;k++)
		{
		System.out.print(" "+finalArray[k]);
		}

	}

	private static void printMergeSort(int[] array) {
		// TODO Auto-generated method stub
		
		int len=array.length;
		//int[] finalArray=new int[len];
		if(len<2)
		return;
		
		int mid=len/2;
		int[] left=new int[mid];
		int[] right=new int[len-mid];
		for(int i=0;i<left.length;i++)
			left[i]=array[i];
		
		for(int i=0;i<right.length;i++)
			right[i]=array[mid+i];
		
		printMergeSort(left);
		printMergeSort(right);
		merge(left,right);
		
		//return array;
		
	}

	private static void merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int level=0;
		int llen=left.length;
		int rlen=right.length;
		int i=0,j=0,k=0;
		while(i<llen && j<rlen)
		{
			if(left[i]<=right[j])
			{
				finalArray[k]=left[i];
				i++;
			}
			else
			{
				finalArray[k]=right[j];
				j++;
			}
			k++;
		}
			while(j<rlen)
			{
				finalArray[k]=right[j];
				j++;
				k++;
			}
		
			while(i<rlen)
			{
				finalArray[k]=left[i];
				i++;
				k++;
			}
		System.out.println("level"+level);
		level++;
			
		
	}

}
