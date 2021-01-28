package uri_problems;

import java.util.Scanner;

public class Problem_1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int[] Arr = new int[10];
		for (int i = 0; i < Arr.length; i++) {
			if (i <= 0) {
				Arr[i] = sc.nextInt();
				temp = Arr[i];
				for (int j = i; j < Arr.length; j++) {
					temp *= 2;
					System.out.println(temp + "   ");
				}
			}

		}
	}

}
