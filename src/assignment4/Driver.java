package assignment4;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, arr[]=new int[5];
		System.out.println("Please enter 5 numbers in the array \n");
		while(i<5) {
			System.out.println("#" + (i+1) + ": ");
			arr[i] = in.nextInt();
			i++;
		}
		
		
		operation(arr, in);
		
		in.close();
	}
	
	public static void operation(int arr[], Scanner in) {
		int opt;
		//Scanner in = new Scanner(System.in);
		System.out.println("Please select the number the corresponds with the operation you would like to perform");
		System.out.println("[1] Insertion Sort\n");
		System.out.println("[2] Bubble Sort\n");
		System.out.println("[3] Select Sort\n");
		System.out.println("[4] Linear Search\n");
		System.out.println("[5] Bubble Search\n");
		in.hasNextInt();
		opt = in.nextInt();
		
		Sorter sort = null;
		Searcher search = null;
		if(opt==1 || opt==2 || opt==3) {
			sort = new Sorter();
		}
		if(opt==4 || opt==5) {
			search = new Searcher();
		}
		
		int result[] = new int[5], res;
		
		switch(opt) {
			case 1:
				result = sort.insertSort(arr, arr.length);
				for(int i=0; i<result.length; i++) {
					System.out.println(result[i]);
				}
				break;
				
			case 2:
				result = sort.bubbleSort(arr, arr.length);
				for(int i=0; i<result.length; i++) {
					System.out.println(result[i]);
				}
				break;
				
			case 3:
				result = sort.selectionSort(arr, arr.length);
				for(int i=0; i<result.length; i++) {
					System.out.println(result[i]);
				}
				break;
				
			case 4:
				int s;
				System.out.println("Please enter the value you wish to search for ");
				s = in.nextInt();
				res = search.linearSearch(arr, arr.length, s);
				System.out.println(res);
				break;
				
			case 5:
				System.out.println("Please enter the value you wish to search for ");
				s = in.nextInt();
				res = search.binarySearch(arr, arr.length, s);
				System.out.println(res);
				break;
		}
		
		in.close();
		
	}

}
