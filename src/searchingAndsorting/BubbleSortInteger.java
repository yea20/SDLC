package searchingAndsorting;

import java.util.Arrays;

public class BubbleSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {7,9,2,4,6,5,8,3,1};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println("After Sorting ");
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0; i<array.length-1; i++) {
			for (int j=1; j<array.length-i; j++) {
				if (array[j-1]>array[j]) {
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}

}
