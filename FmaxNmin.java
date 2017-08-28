
public class FmaxNmin {

	public static void main(String[] args) {

		FmaxNmin.Position();

	}

	public static void Position() {

		int iArray[] = { 25, 16, 90, 34, 7, 10 };
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for (int number : iArray) {
			if (number > largest) {
				largest = number;
			}
		}
		System.out.println("Maximum and Minimum number of a integer Array: "+largest);
		
		for(int number : iArray){
			if(number < smallest){
				smallest = number;
			}
		}
		System.out.println("Minimum and Minimum number of a integer Array: "+smallest);
	}

}
