package my.pack;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		 int n=0;

		 n=getn();
		 int mass[][]=new int[n][n];
		 for(int i=0;i<mass.length;i++) {
			 for(int j=0;j<mass.length;j++) {
				 if(i==0||i==(mass.length-1)) {
					 mass[i][j]=1;
				 }else if(j==0||j==(mass.length-1)) {
					 mass[i][j]=1;
				 }else {
					 mass[i][j]=0;
				 }
			 }
		 }
		
		 for(int[] i: mass) {
			 for(int j: i) {
					System.out.print(j+" ");
			 }
				System.out.println();
		 }
		 
	}
	
	public static Integer getn() {
		int n=0;
		Scanner sc = new Scanner(System.in); 
        System.out.println("¬ведите натуральное четное число ");
		if (sc.hasNext()) { 
			n=sc.nextInt();
			}
		if(n==0||n%2!=0) {
			n=getn();
		}
		return n;
	}
}