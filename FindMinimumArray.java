
public class FindMinimumArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,7,9};
		
		//find the minimumNumber 
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The minimum number in the array is: " +min);

		
		}

}
