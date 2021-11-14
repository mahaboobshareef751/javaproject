package ch1;

public class Calculation {
	void sum(int a,int b){
		System.out.println(a+b);
		}
	   void sum(int a,int b,int c){
		   System.out.println(a+b+c);
		   }

	   public static void main(String args[]){
	      Calculation cal = new Calculation();
	      cal.sum(20,30,60);
	      cal.sum(20,20);
	   }
}
