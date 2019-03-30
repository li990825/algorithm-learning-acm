package math.easy;

import java.util.Scanner;

public class P1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean fa = isValid(a);
		boolean fb = isValid(b);
		if(fa && fb) {
			int sum = add(a, b);
			System.out.println(sum);
		}
	}

	private static boolean isValid(int a) {
		if(a>=0 && a<=10)
			return true;
		return false;
	}

	private static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
