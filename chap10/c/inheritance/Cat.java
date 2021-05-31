package c.inheritance;

public class Cat extends Animal {
	
		public void move() {
		System.out.println(this.name+"이 냐옹냐옹");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("고양고양");
		cat.eatFood("츄르츄르");
		System.out.println(cat.name+" eats "+cat.food+".");
		cat.move();
		System.out.println(cat.name+" has "+cat.legCount+" legs.");
	}

}
