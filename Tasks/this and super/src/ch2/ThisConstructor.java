package ch2;
// sub class
public class ThisConstructor extends SuperConstructor {
	ThisConstructor(){
        this(10,20);
        System.out.println("Subcalss DC ");//DC Default Constructor
    }

    ThisConstructor(int i){
        super(i);       
        System.out.println("Subcalss  SPC with Iteger");//SPC Single Parameterized Constructor
    }

    ThisConstructor(int i, String s){
        this();
        System.out.println("Subcalss  DPC with Iteger and String");//DPC double Parameterized Constructor
    }

    ThisConstructor(int i,int age){
        super(i,age);
        System.out.println("Subcalss  DPC with Iteger and Integer");
    }

    public static void main(String []k){
        System.out.println("=================Frist time Calling ==========================\n");
        ThisConstructor t = new ThisConstructor(1);


        System.out.println("=================Second time Calling ==========================\n");
        ThisConstructor t1 = new ThisConstructor(1,2);
    }
}
