import java.util.Arrays;

public class ReverseArrayString {

	public static void reverse(String[] inputArray) {

		System.out.println("Input array is : " + Arrays.toString(inputArray));

		// Return if array is null or empty
		if (inputArray == null || inputArray.length <= 1) {
			System.out.println("The input array is null or empty");
			return;
		} else {
			System.out.println("Size of  Array is: " + inputArray.length);
		}

		for (int i = 0; i < inputArray.length / 2; i++) {
			String temp = inputArray[i];
			// swap string
			inputArray[i] = inputArray[inputArray.length - 1 - i];
			inputArray[inputArray.length - 1 - i] = temp;
		}

		System.out.println("Reversed array is: " + Arrays.toString(inputArray));
	}


	public static void main(String[] args) {
	
		System.out.println("Reverse an Array of a String [“Singapore”,”Paris”,”New York”,”Japan”]");
		
		String[] str = { "Singapore", "Paris", "New York","Japan"};
		
		reverse(str);
	}
}