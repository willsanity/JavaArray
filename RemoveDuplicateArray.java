
public class RemoveDuplicateArray {

	public static void main(String[] args) {
		RemoveDuplicateArray.removeDuplicates();
	}

	public static void removeDuplicates() {
		int iArray[] = { 1, 3, 4, 5, 7, 3, 2 };
		boolean arr[] = new boolean[iArray.length];

		for (int i = 0; i < iArray.length - 1; i++) {
			if (!arr[i]) {
				for (int j = i + 1; j < iArray.length; j++) {

					if (iArray[i] == iArray[j]) {
						arr[i] = true;
						arr[j] = true;
					}

				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
				System.out.print(iArray[i]);
			}
		}

	}



}
