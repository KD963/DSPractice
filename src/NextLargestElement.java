import java.util.Scanner;

public class NextLargestElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int numbers = scanner.nextInt();
		int[] numberArray = new int[numbers];
		System.out.println("-------------------------");
		for (int i = 0; i <= numberArray.length - 1; i++) {
			numberArray[i] = scanner.nextInt();
		}

		int largest = numberArray[0];
		int secondLargest = numberArray[1];
		// System.out.println("Assume Largest number " + largest);
		// System.out.println("Assume SecondLargest number " + secondLargest);

		if (numberArray[0] > numberArray[1]) {
			largest = numberArray[0];
			secondLargest = numberArray[1];
		} else {
			largest = numberArray[1];
			secondLargest = numberArray[0];
		}

		for (int i = 2; i <= numberArray.length - 1; i++) {
			if (numberArray[i] > largest) {
				secondLargest = largest;
				largest = numberArray[i];
				System.out.println("Largest " + largest);
			} else if (numberArray[i] < secondLargest) {
				secondLargest = numberArray[i];
				System.out.println(secondLargest);
			}

		}
		System.out.println("Second largest " + secondLargest);

	}

}
