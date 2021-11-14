
public class Two_static_variables {

		 static int my_count=2;
		   public void increment(){
		      my_count++;
		   }
		   public static void main(String args[]){
			
		      Demo obj_1=new Demo();
		      Demo obj_2=new Demo();
		      obj_1.increment();
		      obj_2.increment();
		      System.out.println("The count of first object is "+obj_1.my_count);
		      System.out.println("The count of second object is "+obj_2.my_count);
		   
		
	}

}
