//在构造器中调用构造器

public class Flower {
	int petalCount = 0;
	String s = " initial value";

	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
	}

	Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}

	
	Flower(String s, int petals){
		this(petals); //在构造器中调用构造器
		//不能使用this(s)， 不能调用两次构造器
		this.s = s; //若方法中的形参和类内的实例变量名称相同时，可以使用this表明实例变量
		System.out.println("String and int args");
	}

	Flower() {
		this("hi", 47);
		System.out.println("no-arg Constructor");
	}

	void printPetalCount() {
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}

