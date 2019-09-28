package assignment4;

public class Searcher {
	public int linearSearch(int arr[], int arrSize, int searchVal){
		int i =0;
		while(i<arrSize) {
			if(arr[i] == searchVal) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public int binarySearch(int arr[], int arrSize, int searchVal) {
		int start = 0, end = arrSize -1, mid;
		while(start <= end) {
			mid = (start + end)/2;
			
			if(searchVal == arr[mid]) {
				return mid;
			}
			if(searchVal < arr[mid]) {
				end = mid-1;
			}
			if(searchVal > arr[mid]) {
				start = mid+1;
			}
		}
		return -1;
	}
}
