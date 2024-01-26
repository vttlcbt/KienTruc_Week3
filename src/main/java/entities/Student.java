package entities;

/*
 * This is a test class
 * @Author: Bich Tuyen - 20067001
 * */
public class Student {
	private String id;
	private String name;
	private String birthday;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

	public Student(String id, String name, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
