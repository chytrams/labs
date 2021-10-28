package lab1;


import java.util.*;
public class exrc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int a = sc.nextInt();
		int sum=0,n;
		while(a!=0)
		{
		n = a%10;
		sum = sum +(n*n*n);
		a = a/10;

		}
		System.out.println(sum);

	}

}
