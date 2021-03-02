package member;

public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private int age;
	private int grade;
	
	public MemberDTO(String id, String pass, String name, int age, int grade) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
