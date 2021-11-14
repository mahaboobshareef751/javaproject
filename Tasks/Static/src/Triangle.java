
public class Triangle {

	int length,breadth;//instance variable declaration in method
	void Findarea(int l,int b) {
		int c=1/2*l*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Triangle tr=new Triangle();
	tr.Findarea(48,38);

	}

}
