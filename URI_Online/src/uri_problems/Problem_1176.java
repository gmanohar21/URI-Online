package uri_problems;

import java.util.Scanner;

public class Problem_1176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[10];
		for (int i = 0; i < Arr.length; i++) {

			Arr[i] = sc.nextInt();
			if (Arr[i] <= 0) {
				Arr[i] = 1;
			}
			System.out.println(Arr[i] + "  end");
		}

	}

}
