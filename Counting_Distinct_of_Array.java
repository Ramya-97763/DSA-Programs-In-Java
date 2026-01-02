
 import java.util.Scanner;
 public class Counting_Distinct_of_Array{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter list a number");
		      int n=sc.nextInt();
	          int a[]=new int[n];
			  System.out.println("Enter a list of numbers");
			  for(int i=0;i<n;i++){
			  a[i]=sc.nextInt();}
				  int b[]=new int[n];
				  int k=0;
			      for(int i=0;i<n;i++){
                  int current=a[i];
           boolean found=false;
		   for (int j=0;j<k;j++){
			   if(b[j]==current){
				   found= true;
			   break;}}
		   if(!found){
		b[k]=current;
	k++;}}
	System.out.println("count of distinct elements ="+k);
	
			 
 }	}	