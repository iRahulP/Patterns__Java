package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int val = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(val);
				val = val + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		
	}

}
