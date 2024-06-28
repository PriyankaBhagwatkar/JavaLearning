
public class BubbleSort {

	public static void main(String[] args) {
		//Bubble Sort
		//Bubble sort is a simple sorting algorithm that repeatedly steps through the list, 
		//compares adjacent elements, and swaps them if they are in the wrong order.
		//Declare a couple of loop to compare the number in the array
		//The array will be sorted in ascending order by replacing the elements if found in any other order
		
		int[] a = {7,4,9,12,1,2,5};
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a.length - i - 1; j++) {
		        if (a[j] > a[j + 1]) {
		            int temp = a[j];
		            a[j] = a[j + 1];
		            a[j + 1] = temp;
		        }
		    }
		}
		
		// Print the sorted array
		System.out.print("Sorted Array: ");
		for (int i = 0; i < a.length; i++) {
		    System.out.print(a[i] + " ");
		}
	}

}
