package PracticalExam;

public class FoodMain3 {

	public static void main(String[] args) {
		Food fd = new Food();
		fd.setFoodCode(1);
		fd.setDiscription("Apple");
		fd.setAmount(50);
		fd.setQuantity(12);
		
		fd.ShowBill(1);
//		for(int i=0;i<5;i++) {
//			fd[i]=new Food();	
//		}
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enetr Food Code");
//		int foodcode= sc.nextInt();
//		Food food1=new Food();
//		food1.ShowBill(foodcode);
		
		
	}

}
