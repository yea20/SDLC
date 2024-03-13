package searchingAndsorting;

import java.util.Scanner;

public class BinarySearch_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String array[]= {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ"};
		System.out.print("Enter Search Data: ");
		String data=sc.next();
		search(array,data);
	}

	private static void search(String[] array, String data) {
		// TODO Auto-generated method stub
		int first=0;
		int last=array.length-1;
		int mid;
		while(first<=last) {
			mid=(first+last)/2;
			if(data.compareToIgnoreCase(array[mid])<0) {
				last=mid-1;
			}
			else if(data.compareToIgnoreCase(array[mid])>0) {
				first=mid+1;
			}
			else {
				System.out.println(data + " is found at "+mid);
				break;
			}
		}
		if(first>last) {
			System.out.println(data+ " is not found in the given array ");
		}
	}

}
