/**
* CS 111 Section No. 002
* Lab Assignment 12
* Samuel Harris **/

//I expect the iterative method to be the fastest since it doesn't have to call itself a bunch of times.
//Calling a bunch of methods will reduce efficiency.

//Actual Times:
//1. I: 0 ms R: 0 ms
//2. I: 0 ms R: 0 ms
//3. I: 0 ms R: 0 ms

public class GeometricSeries {
	//Iterative Geometric Series Calculator
	public static double calculateGeometricSeriesIterative(double a, double r, int n) {
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += a * Math.pow(r, i);
		}
		return sum;
	}

	//Recursive Geometric Series Calculator
	public static double calculateGeometricSeriesRecursive(double a, double r, int n) {
		//Base case
		if (n == 1) {
			return a * r;
		} else if (n == 0) {
			return a;
		}
		//Recursive case
		return (a * Math.pow(r, n) + calculateGeometricSeriesRecursive(a,r, (n-1)));

	}

	public static void main(String args[]) {
		//Iterative Time/Test
		long startTime_Iter = System.currentTimeMillis();
		calculateGeometricSeriesIterative(5, 10, 100);
		long endTime_Iter = System.currentTimeMillis();
		System.out.println("Here is the start and end time for the iterative method, respectively.");
		System.out.println(startTime_Iter);
		System.out.println(endTime_Iter);
		System.out.println("Here is the execution time (milliseconds): " + (endTime_Iter - startTime_Iter) + "\n");
		
		//Recursive Time/Test
		long startTime_Rec = System.currentTimeMillis();
		calculateGeometricSeriesRecursive(5, 10, 100);
		long endTime_Rec = System.currentTimeMillis();
		System.out.println("Here is the start and end time for the recursion method, respectively.");
		System.out.println(startTime_Rec);
		System.out.println(endTime_Rec);
		System.out.println("Here is the execution time (milliseconds): " + (endTime_Rec - startTime_Rec));
		
	}
}
