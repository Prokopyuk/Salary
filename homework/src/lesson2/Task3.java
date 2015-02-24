package lesson2;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		int[][] buble = {
				{ 45, 4, 6, 8},
				{ 3, 5, 1, 8,1}

		};

		// System.out.println("Enter n");

		int n = 2;

		for (int[] array : buble) {
			shift(array, n);
		}

		for (int[] is : buble) {
			System.out.println(Arrays.toString(is));
		}

	}

	public static void shift(int [] buble, int n) {
		if (n > 0) {
			for (int j = 0; j < n; j++) {

				int temp = buble[buble.length - 1];

				for (int i = buble.length - 1; i > 0; i--) {
					buble[i] = buble[i - 1];
				}
				buble[0] = temp;
			}

		} else if (n < 0) {
			for (int j = 0; j < -n; j++) {
				int temp = buble[0];
				for (int i = 0; i <buble.length - 1; i++) {
					buble[i] = buble[i +1];
				}
				buble[buble.length - 1]=temp;



			}
		}
	}
}
