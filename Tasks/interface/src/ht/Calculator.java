package ht;

//Calculator interface which extends
//both the above defined interfaces
public interface Calculator extends Add_Sub, Mul_Div {
	 public void printResult(double result);
}
