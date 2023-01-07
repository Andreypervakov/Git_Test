public class Fruit {
	public Fruit(){
		System.out.println("Constructor of Fruit");
	}
	void method(){
		System.out.println("Method of Fruit");
	}
	public static void main(String[] args) {
		Fruit f = new Apple();
		f.method();
	}
}

class Apple extends Fruit {
	public Apple() {
		System.out.println("Constructor of Apple");
	}
	protected void method() {
		System.out.println("Method of Apple");
	}
}
