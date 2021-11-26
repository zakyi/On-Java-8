//当类内的某些方法需要调用外部方法时，且传入的参数为自身，使用this

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

public class Peeler {
	static Apple peel(Apple apple){
		//...remove peel
		return apple;
	}
}

public class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

public class PassingThis {
	public static void main(String[] args){
		new Person().eat(new Apple());
	}
}