/**
* CS 111 Section No. 002
* Lab Assignment 12
* Samuel Harris **/

public class ArrayRecursion {
	public static int countElements(int[] array, int position) {
		//Base cases
		if (array.length == 0) {
			return 0;
		}
		if (position == array.length - 1) {
			if (array[position] % 3 == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		//Recursive case
			if (array[position] % 3 == 0) { //Condition will be satisfied if the value is divisible by 3.
				return 1 + countElements(array, position + 1);
			} else {
				return countElements(array, position +1);
			}
	}
	
	public static void main (String args[]) {
		//Test 1
		int [] arr = {1,2,3,9,12};
		System.out.println(countElements(arr, 0));
		
		//Test 2
		int [] arr2 = {3};
		System.out.println(countElements(arr2, 0));
		
		//Test 3
		int [] arr3 = {3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		System.out.println(countElements(arr3, 13));

	}
}
