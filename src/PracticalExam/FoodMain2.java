package PracticalExam;

import java.util.Scanner;

public class FoodMain2 {

	public static void main(String[] args) {
		Food fd = new Food();
		fd.setFoodCode(1);
		fd.setDiscription("Apple");
		fd.setAmount(50);
		fd.setQuantity(12);
		
		Scanner sc=new Scanner(System.in);
		int foodcode=0;
		int qty=0;
		char ch ='y';
		
		
		do  {
			System.out.println("Please Select the Choice");
			System.out.println("1. Add Food Item");
			System.out.println("2. Show Bill");
			System.out.println("3.Exit");
			int option=sc.nextInt();
			
			switch(option) {
			case 1 :
				System.out.println("Enetr Food Code");
				 foodcode= sc.nextInt();
				 System.out.println("Enter the Quantity");
				 qty=sc.nextInt();
				 
				 break;
			case 2 :
				System.out.println("Enetr Food Code");
				 foodcode= sc.nextInt();
				 fd.ShowBill(1);
				
			case 3:
				System.out.println("Good Bye!");
				System.exit(0);
				
			default:
				System.out.println("Plz select the correct option !");
				break;
				
			}
		}
		while(true);
		
	}

}
