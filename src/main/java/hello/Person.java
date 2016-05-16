package hello;

public class Person {

	private String name;
	
	private String sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void say(String name, String sex){
		Person p = new Person();
		p.setName(name);
		p.setSex(sex);
		System.out.println(p.getName());
	}
	
	public static void main(String[] args) {
		String name="jlh";
		String sex="man";
		say(name,sex);
	}
}
