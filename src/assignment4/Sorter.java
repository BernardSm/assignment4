package assignment4;

public class Sorter {
	public int[] bubbleSort(int arr[], int arrSize) {
		int i=0, swapMode=1, temp, cnt2;
		while(i<arrSize && swapMode ==1) {
			swapMode = 0;
			cnt2 = arrSize-1;
			while(cnt2>i) {
				if(arr[cnt2]<arr[cnt2-1]) {
					temp = arr[cnt2-1];
					arr[cnt2-1] = arr[cnt2];
					arr[cnt2] = temp;
					swapMode = 1;
				}
				cnt2--;
			}
			i++;
		}
		return arr;
		
	}
	
	public int[] selectionSort(int arr[], int arrSize) {
		int i=0, iSmallest, temp, cnt2;
		while(i<arrSize) {
			iSmallest =i;
			cnt2 = i+1;
			while(cnt2<arrSize) {
				if(arr[cnt2] < arr[iSmallest]) {
					iSmallest = cnt2;
				}
				cnt2++;
			}
			temp = arr[i];
			arr[i] = arr[iSmallest];
			arr[iSmallest] = temp;
			i++;
		}
		return arr;
		
	}
	
	public int[] insertSort(int arr[], int arrSize) {
		int i=1, temp, cnt2;
		while(i<arrSize) {
			temp = arr[i];
			cnt2 = i;
			while(cnt2>=0 && temp <= arr[cnt2-1]) {
				arr[cnt2] = arr[cnt2-1];
				cnt2--;
			}
			arr[cnt2] = temp;
			i++;
		}
		return arr;
		
	}
}
