import java.util.Scanner;
public class EBill{  
   private int cost=0;
   public void CalcCost(int unit){
       if(unit<0)
	{
		System.out.println("Invalid Input");
	}
	else if(unit>0 && unit<=100){
		cost=unit*5;
		}
	else if(unit>100 && unit<301)
	{
		cost=500+((unit-100)*10);
	}
	else if(unit>300)
	{
		cost=2500+((unit-300)*20);
	}
   }
   public int PrintCost(){
       return cost;
   }
	
 public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of units");
	int unit=sc.nextInt();
	EBill obj=new EBill();
	obj.CalcCost(unit);
	System.out.println("Final Bill: "+obj.PrintCost());
	  
}    
}   
