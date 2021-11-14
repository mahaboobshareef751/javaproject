package access_modifiers;

public class ClassB extends ClassA {
	void test() {

        System.out.println(clazzName); //public field can be inherited to any sub class

        ClassA classA = new ClassA();

        System.out.println(classA.clazzName); //public field can be used anywhere

        classA.getName(); //public method can be used anywhere

        ClassA.InnerClass b = new ClassA.InnerClass(); //public Inner Class can be used anywhere.
    }
}


