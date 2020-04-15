package my.pack;
import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		 int n=0;

		 n=getn();
		 int mass[][]=new int[n][n];
		 
		 //first part
		 for(int i=0;i<mass.length/2;i++) {
			 for(int j=0;j<mass.length/2;j++) {
				 if(j<i) {
					 mass[i][j]=0;
				 }else {
					 mass[i][j]=1;
				 }
			 }
		 }
		 //second part
		 for(int i=0;i<mass.length/2;i++) {
			 for(int j=mass.length/2;j<mass.length;j++) {
				 if(j>=mass.length-i) {
					 mass[i][j]=0;
				 }else {
					 mass[i][j]=1;
				 }
			 }
		 }
		 
		 //third part
		 for(int i=mass.length/2;i<mass.length;i++) {
			 for(int j=0;j<mass.length/2;j++) {
				 if(j>=(mass.length-i-1)) {
					 mass[i][j]=1;
				 }else {
					 mass[i][j]=0;
				 }
			 }
		 }
		
		 //fourth part
		 for(int i=mass.length/2;i<mass.length;i++) {
			 for(int j=mass.length/2;j<mass.length;j++) {
				 if(i<j) {
					 mass[i][j]=0;
				 }else {
					 mass[i][j]=1;
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
