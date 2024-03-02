package ExamTask03_2023;


public class Person{
	private String name;
	private int age;
	private char gender;

	public Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public int getGender(){
		return gender;
	}
}