
public class ReDemo {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 6, 3 };
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}

}
