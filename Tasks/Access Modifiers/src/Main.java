
public class Main {
	 int firstNum = 5;        //these are global variables.
     int secondNum = 10;      //they can be called by any method.
 
     public void addNum(){
          int answer = 0;     //this is a local variable.
          answer = firstNum + secondNum;
          System.out.println("The sum of two numbers is: " + answer);
     }
 
     public static void main(String args[]){
          Main mains = new Main();
          mains.addNum();
     }
}
