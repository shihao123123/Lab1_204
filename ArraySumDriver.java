/*
@author shihaolu
 */
public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;
		Integer[] myArray = new Integer[ARRAY_SIZE];
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		int sum1=dynamicFib(6);
		System.out.println(sum1);
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		sum1=dynamicFib(5);
		System.out.println(sum);
		System.out.println(sum1);
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */

	public static <T> int sumOfArray(T[] arr, int num) {
		// Implement your code here
		if(num>=0)
			return (int) arr[num--] + sumOfArray(arr, num);
		else
			return 0;
	}
	public static int dynamicFib( int n)
	{
		if(n<=1)
			return n;
		return dynamicFib(n-1)+dynamicFib(n-2);
	}
}