
import java.util.Scanner;
public class Find_GCD_of_two{
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		if(sc.hasNextInt()){
			a=sc.nextInt();
			System.out.println("Enter second value");
			if(sc.hasNextInt()){
				b=sc.nextInt();
			    if(a<b){
					int temp=a;
					a=b;
				    b=temp;}
					while(b!=0){
						int r=a%b;
						a=b;
					    b=r;}
					int gcd = a;
					System.out.println("The GCD is "+gcd);
		    }else{
			    System.out.println("Invalid! Enter integer value");}
		}else{
		    System.out.println("Invalid! Enter integer value");}
}}				
	
			