package lesson02;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		int b = scan.nextInt();

		int c = scan.nextInt();

		int answer = answer(a, b, c);

		System.out.println(answer);

	}

	public static int answer(int a, int b, int c) {

		int m = divide(a, b);

		int r = add(c, m);

		return r;

	}

	public static int divide(int a, int b) {

		return a / b;

	}

	public static int add(int c, int m) {

		return c + m;

	}

}