
public class ASDM {

		private int a;
		private int b;
		private int res;
		
		public int Addition(int a, int b) {
			res=a+b;
			return res;
			}
		
		public int substract(int a, int b) {
			res=a-b;
			return res;
		}

		public int multiplication(int a, int b) {
				res=a*b;
				return res;
			
		}
		
		public int Division(int a, int b) {
					res=a/b;
					return res;
		}
	

	public static void main(String[] args) {
		
		ASDM e=new ASDM();

		System.out.println("result="+e.Addition(10, 20));
		System.out.println("result="+e.substract(10, 5));
		System.out.println("result="+e.multiplication(10, 10));
		System.out.println("result="+e.Division(10, 5));
		
	}

}



