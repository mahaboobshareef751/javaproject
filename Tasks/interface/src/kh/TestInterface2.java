package kh;

public interface TestInterface2 {
	// Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}
