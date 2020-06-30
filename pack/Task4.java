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
					System.out.println("Ìàêñèìàëüíîå çíà÷åíèå â ìàòðèöå: "+maxi);
			 }
		 }
		
		 for(int[] i: mass) {
			 for(int j: i) {
					System.out.print(j+" ");
			 }
				System.out.println();
		 }
		 
		 System.out.println("Ñóììû îòðèöàòåëüíûõ ÷èñåë äëÿ êàæäîé ñòðîêè: ");
	     for(int i=0;i<negativeSumm.length;i++) {
			 System.out.print(negativeSumm[i]+" ");

	     }   

		System.out.println("Ìèíèìàëüíîå çíà÷åíèå â ìàòðèöå: "+min);
		
		 System.out.println("Ìàêñèìàëüíûå çíà÷åíèÿ â êàæäîé èç ñòðîê: ");
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
		
	     System.out.println("Ìàòðèöà ïîñëå ïåðåìåùåíèÿ ìèíèìàëüíîãî è ìàêñèìàëüíîãî çíà÷åíèé:");
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
        System.out.println("Ââåäèòå íàòóðàëüíîå ÷èñëî äëÿ çàäàíèÿ ðàçìåðà ìàòðèöû");
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
			System.out.println("Ââåäèòå íàòóðàëüíå ÷èñëî äëÿ ñòðîêè ìàòðèöû");
			if (sc.hasNext()) { 
				row[i]=sc.nextInt();
				}
		}
		return row;
	}
}
// Вот в задачах этого модуля молодец. Все решено корректно. Молодец, зачтено
