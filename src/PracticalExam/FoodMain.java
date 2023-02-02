package PracticalExam;

import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) {
		Food fd[] = new Food[5];
		fd[0]=new Food(1,12,"Apple",15);
		fd[1]=new Food(2,1,"Banana",4);
		fd[2]=new Food(3,1,"Coconut",40);
		fd[3]=new Food(4,1,"Chiku",5);
		fd[4]=new Food(5,1,"Guava",10);
		
		for(int i=0;i<5;i++) {
			fd[i]=new Food();	
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Food Code");
		int foodcode= sc.nextInt();
		Food food1=new Food();
		food1.ShowBill(foodcode);
		
		
	}

}
