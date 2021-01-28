package uri_problems;

import java.util.Scanner;

public class Problem_1174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] Arr = new double[100];
		for (int i = 0; i < Arr.length; i++) {
			System.out.println("Enter the Numbers less than 10 :----   ");
			Arr[i] = sc.nextDouble();
			if (Arr[i] <= 10) {
				System.out.println(Arr[i]);
			}
		}
	}

}
