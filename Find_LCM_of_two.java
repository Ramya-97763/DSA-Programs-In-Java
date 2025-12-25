
import java.util.Scanner;
public class Find_LCM_of_two{
public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first value");
    if(sc.hasNextInt()){
        a=sc.nextInt();
        System.out.println("enter second value");
        if(sc.hasNextInt()){
             b=sc.nextInt();
             if(a<b){
	             int temp=a;
	             a=b;
                 b=temp;
				 int x=a;
				 int y=b;
				 while(b!=0){
					 int r=a%b;
					 a=b;
					 b=r;
				 }
				 int gcd=a;
				 int Lcm=(x*y)/a;
			 System.out.println(Lcm);}
				 
        }else{
	         System.out.println("Invalide! Enter integer value");}
    }else{
	System.out.println("Invalide! Enter integer value");}	
}}