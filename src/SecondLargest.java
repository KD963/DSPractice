import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array element ");
		int number = scanner.nextInt();
		int array[] = new int[number];
		System.out.println("Enter array element :");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		int largest1 = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest1 && array[i] < largest) {
				largest1 = array[i];
			}
		}
		System.out.println("largest element " + largest);
		System.out.println("second largest element :" + largest1);
	}

}
