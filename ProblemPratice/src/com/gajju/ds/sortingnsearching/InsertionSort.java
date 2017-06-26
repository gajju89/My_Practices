package com.gajju.ds.sortingnsearching;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{7,9,4,32,97,12,5};
		int [] result=printInsertionSort(array);
		System.out.println("After Insertion Sort:");
		for(int k=0;k<result.length;k++)
		{
		System.out.print(" "+result[k]);
		}

	}

	private static int[] printInsertionSort(int[] array) {
		// TODO Auto-generated method stub
		for(int i=1;i<array.length;i++)
		{
			int key=array[i];
			int j=i-1;
			while(j>=0&&array[j]>key)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
			
		}
		return array;
	}
	/*=======complexity====================================================
	 * while loop reduces one inversion. The while loop executes only if i > j 
	 * and arr[i] < arr[j]. Therefore total number of while loop iterations (For all values of i)
	 * is same as number of inversions. Therefore overall time complexity of the insertion sort is
	 * O(n + f(n)) where f(n) is inversion count. If the inversion count is O(n),
	 * then the time complexity of insertion sort is O(n). 
	 * In worst case, there can be n*(n-1)/2 inversions.
	 * The worst case occurs when the array is sorted in reverse order. 
	 * So the worst case time complexity of insertion sort is O(n2).
	 */

}
