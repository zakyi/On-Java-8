//这种情况下编译器不会创建无参构造器Bird() {}

class Bird() {
	Bird(int i){}
	Bird(double d){}
}

public class NoSynthesis {
	public static void main(String[] args) {
		Bird b1 = new Bird(1);
		Bird b2 = new Bird(1.0);
	}
}