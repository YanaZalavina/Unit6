package my.pack;
import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		 int n=0;
		 int m=0;
		 int min=0;
		 int maxi=0;
		 int rowNumMin=0;
		 int colNumMin=0;
		 int rowNumMax=0;
		 int colNumMax=0;

		 n=getSize();
		 m=getSize();
		 int mass[][]=new int[n][m];
		 int temp[]=new int[m];
		 int negativeSumm[]=new int[n];
		 int maxElementInRow[]=new int[n];
		 
		 for(int i=0;i<n;i++) {
			 temp=getRow(m);
			 int sum=0;
			 int max=0;
			 for(int j=0;j<temp.length;j++) {
				 mass[i][j]=temp[j];
				 if(temp[j]>max) {
					 max=temp[j]; 
				 }
				 if(temp[j]<min){
					 min=temp[j];
				 }
				 if(temp[j]<0) {
					 sum+=temp[j];
				 }
				 if(j==temp.length-1) {
					 negativeSumm[i]=sum;
					 maxElementInRow[i]=max;
				 }
			 }
		 }
		 
		 for(int i=0;i<maxElementInRow.length;i++) {
			 if(maxElementInRow[i]>maxi) {
				 maxi=maxElementInRow[i];
			 }
			 if(i==maxElementInRow.length-1) {
					System.out.println("ћаксимальное значение в матрице: "+maxi);
			 }
		 }
		
		 for(int[] i: mass) {
			 for(int j: i) {
					System.out.print(j+" ");
			 }
				System.out.println();
		 }
		 
		 System.out.println("—уммы отрицательных чисел дл€ каждой строки: ");
	     for(int i=0;i<negativeSumm.length;i++) {
			 System.out.print(negativeSumm[i]+" ");

	     }   

		System.out.println("ћинимальное значение в матрице: "+min);
		
		 System.out.println("ћаксимальные значени€ в каждой из строк: ");
	     for(int i=0;i<negativeSumm.length;i++) {
			 System.out.print(maxElementInRow[i]+" ");
	     }
	     //find row and column nubmers for max/min
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<m;j++) {
	    		 if(mass[i][j]==min) {
	    			 rowNumMin=i;
	    			 colNumMin=j;
	    		 }else if(mass[i][j]==maxi) {
	    			 rowNumMax=i;
	    			 colNumMax=j;
	    		 }
	    	 }
	     }
	     
	     //swap min/max
	     mass[rowNumMin][colNumMin]=maxi;
	     mass[rowNumMax][colNumMax]=min;
		
	     System.out.println("ћатрица после перемещени€ минимального и максимального значений:");
		 for(int[] i: mass) {
			 for(int j: i) {
					System.out.print(j+" ");
			 }
				System.out.println();
		 }
	}
	
	public static Integer getSize() {
		int n=0;
		Scanner sc = new Scanner(System.in); 
        System.out.println("¬ведите натуральное число дл€ задани€ размера матрицы");
		if (sc.hasNext()) { 
			n=sc.nextInt();
			}
		if(n==0) {
			n=getSize();
		}
		return n;
	}
	
	public static int[] getRow(int m) {
		int row[]=new int[m];
		Scanner sc = new Scanner(System.in); 
		for(int i=0;i<m;i++) {
			System.out.println("¬ведите натуральне число дл€ строки матрицы");
			if (sc.hasNext()) { 
				row[i]=sc.nextInt();
				}
		}
		return row;
	}
}

