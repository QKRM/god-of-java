package c.inheritance;

public class Animal {
	String name;
	int legCount = 4;
	String kind;
	
	public void move() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eatFood(String food) {
		this.food = food;
		System.out.print("다먹었습니다.");
		if(kind == "cat") {
			System.out.println("골골송부르는중");
		}
		else if (kind == "dog") {
			System.out.println("개를 안키워서 잘 모르겠습니다.");
		}
	}
}
