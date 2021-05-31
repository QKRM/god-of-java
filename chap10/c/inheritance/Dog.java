package c.inheritance;

public class Dog extends Animal {

	public void move() {
		System.out.println(this.name+"이 멍멍");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("멍멍이");
		cat.eatFood("개뼈다구");
		System.out.println(cat.name+" eats "+cat.food+".");
		cat.move();
		System.out.println(cat.name+" has "+cat.legCount+" legs.");
	}

}
