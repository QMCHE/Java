package dgsw.y2.c1.n11.inheritance;

public class Person {
	private String name;
	private String gender;
	private String job;
	private int age;
	
	public Person(String job, String name) {
		this.job = job;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person person = new Person("����", "ȫ�浿");
		Teacher teacher = new Teacher("����");
		Student student = new Student("��ȸ");
		
		System.out.println("person - " + person.getJob() + " " + person.getName());
		System.out.println("teacher - " + teacher.getJob() + " " + teacher.getName());
		System.out.println("student - " + student.getJob() + " " + student.getName());
		
		Person teacher1 = new Teacher("������");
		Student student1 = new Student("����");
		
		System.out.println("teacher1 - " + teacher1.talk());
		System.out.println("student1 - " + student1.talk());
	}
	
	public String talk() {
		
		return null;
	}
}
