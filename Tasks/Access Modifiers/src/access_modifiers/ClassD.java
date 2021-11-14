package access_modifiers;

public class ClassD extends ClassA {
	void methodOfClassD() {
        System.out.println(clazzName); // public field can be inherited to any sub class

        ClassA a = new ClassA();
        System.out.println(a.clazzName); // Public field can be used anywhere
        a.getName(); // Public method can be used anywhere
        ClassA.InnerClass innerClass = new ClassA.InnerClass(); // Public inner class can be used anywhere
    }

}
