package ch2;

public class SuperConstructor {
	SuperConstructor(){
        this(10);
        System.out.println("Super DC");
    }

    SuperConstructor(int a){
        this(10,20);
        System.out.println("Suer SPC with Iteger");
    }

    SuperConstructor(int i,int j){
        System.out.println("Super with  DPC with Iteger and Integer");
    }
}
