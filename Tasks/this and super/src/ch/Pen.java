package ch;
//Call argument constructor of current class using this()
public class Pen {
	String Name,clr;
	int price;
	

Pen(String N,String c,int p){
	System.out.println("pen writes good");
	this.Name=N;
	this.clr=c;
	this.price=p;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pen p=new Pen("bullpoint pen","darkblue",25);  
System.out.println(p.Name+" "+p.clr+" "+p.price);
	}

}
