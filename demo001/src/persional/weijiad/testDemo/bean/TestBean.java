package persional.weijiad.testDemo.bean;

public class TestBean {
	private int age;
	private String name;
	public TestBean(){
		System.out.println("无参的构造");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStr(){
		return "hello boy";
	}
}
