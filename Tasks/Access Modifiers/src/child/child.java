package child;

import grandchild.Grandchild;
import parent.Parent;

public class child extends parent{
	public void anyMethod(Child child, Grandchild grandchild) {
        this.method();
        child.method();
        grandchild.method();
    }
}
