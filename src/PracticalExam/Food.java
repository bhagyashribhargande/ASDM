package PracticalExam;

import java.util.Objects;

public class Food {
	private int foodCode;
	private int quantity;
	private String discription;
	private int amount;
	private float Gst;
	
	public int getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(int foodCode) {
		this.foodCode = foodCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getGst() {
		return Gst;
	}

	public void setGst(float gst) {
		Gst = gst;
	}

	public Food(int foodCode, int quantity, String discription, int amount) {
		super();
		this.foodCode = foodCode;
		this.quantity = quantity;
		this.discription = discription;
		this.amount = amount;
		
	}
	
	
	public void ShowBill(int foodCode) {
		if(this.foodCode== foodCode) {
			getAmount();
			getQuantity();
			getDiscription();
					
		}

		amount=amount*quantity;
		float cgst= (float) (amount*0.09);
		float sgst=(float) (amount*0.09);
		Gst= cgst+sgst;
		
		float GrandTotal= amount+Gst;

		System.out.println("Food Code :"+foodCode);
		System.out.println("Discription :"+this.discription);
		System.out.println("Quantity :"+this.quantity);
		System.out.println("--------------------------------------------------------");
		System.out.println("Total :"+this.amount);
		System.out.println("CGST: "+ cgst);
		System.out.println("SGST :"+ sgst);
		System.out.println("--------------------------------------------------------");
		System.out.println("Grand Total :" + GrandTotal);
		
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(Gst, amount, discription, foodCode, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Float.floatToIntBits(Gst) == Float.floatToIntBits(other.Gst) && amount == other.amount
				&& Objects.equals(discription, other.discription) && foodCode == other.foodCode
				&& quantity == other.quantity;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
