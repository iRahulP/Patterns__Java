package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
