
public class Ant {
	private int height;
	private int age;
	
	public Ant(int h, int a) {
		height = h;
		age = a;
	}
	
	public Ant() {
		this(0,0);
	}
	
	public Ant(Ant anotherObject) {
		this(anotherObject.height, anotherObject.age);
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getAge() {
		return age;
	}
	
	public Ant copyme(Ant a) {
		a = new Ant(height, age);
		Ant b = a;
		return b;
	}
	
	public Ant copyme() {
		Ant clone = new Ant(this.height, this.age);
		return clone;
	}
	
	public boolean equals(Ant o) {
		if(height == o.height && age == o.age)
			return true;
		return false;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Ant))
			return false;
		return this.equals((Ant) o);
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String toString() {
		return height + " " + age;
	}
}
