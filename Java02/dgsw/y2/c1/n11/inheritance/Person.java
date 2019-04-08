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
		Person person = new Person("µµµÏ", "È«±æµ¿");
		Teacher teacher = new Teacher("°øÀÚ");
		Student student = new Student("¾ÈÈ¸");
		
		System.out.println("person - " + person.getJob() + " " + person.getName());
		System.out.println("teacher - " + teacher.getJob() + " " + teacher.getName());
		System.out.println("student - " + student.getJob() + " " + student.getName());
		
		Person teacher1 = new Teacher("¼±»ý´Ô");
		Student student1 = new Student("°í±³»ý");
		
		System.out.println("teacher1 - " + teacher1.talk());
		System.out.println("student1 - " + student1.talk());
	}
	
	public String talk() {
		
		return null;
	}
}
