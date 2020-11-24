package boj;

import java.util.Scanner;

public class _1085_직사각형탈출 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		int min_x = Math.min(x, w-x);
		int min_y = Math.min(y, h-y);
		System.out.println(Math.min(min_x, min_y));

	}

}
