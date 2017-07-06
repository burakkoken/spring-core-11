import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private String name;
	private int age;
	private String telephone;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Required
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", telephone=" + telephone + ", address=" + address + "]";
	}
	
	
	

}
