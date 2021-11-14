package ch6;
// constructor does not contain the return type because this program not given the out put
public class Student {
int id;
String name;

public void Student() {
	System.out.println("default constructor called");
}
public int getId() {
	return id;
}
	public void setId(int Id) {
		this.id=id;
}
	public String getname() {
		return name;
}
	public void setname(String name) {
		this.name= name;
}
}
