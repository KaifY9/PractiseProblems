
public class Animal implements Comparable<Animal> {

	private int age;
	private String name;
	private int weight;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Animal(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Animal that) {
		// TODO Auto-generated method stub
		return this.age-that.age;
		
	}
	
	
}
