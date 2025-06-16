package in.sp.beans;

public class student {
private int rollno;
private String name;
private address Address;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public address getAddress() {
	return Address;
}
public void setAddress(address address) {
	System.out.println("address is injected");
	Address = address;
	
}

public void display()
{
	System.out.println("Roll no "+ rollno);
	System.out.println("Name"+ name);
	System.out.println("Address"+Address);
}
@Override
public String toString() {
	return "student [rollno=" + rollno + ", name=" + name + ", Address=" + Address + ", getRollno()=" + getRollno()
			+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
