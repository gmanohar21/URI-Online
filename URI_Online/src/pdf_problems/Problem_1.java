package pdf_problems;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = sc.nextInt();
		int Arr[] = new int[input];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 27);
			// Addition of Array
			sum = sum + Arr[i];

		}

		System.out.println("Sum of Elements  :-" + sum);
		System.out.println("Average of Elements  :-" + (sum / Arr.length));
	}

}
