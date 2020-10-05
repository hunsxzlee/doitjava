package chapter13.stream;

public class Student02 {
	public enum Sex { MALE, FEMMALE }
	public enum City { Seoul, Pusan }

	private String name;
	private int score;
	private Sex sex;
	private City city;

	public Student02(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public Student02(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}	

	public String getName() {return name;}
	public int getScore() {return score;}
	public Sex getSex() {return sex;}
	public City getCity() {return city;}
}