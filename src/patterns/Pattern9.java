package patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int counter = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(counter);
				j++;
				counter++;
			}
			System.out.println();
			i++;
		}
	}

}
