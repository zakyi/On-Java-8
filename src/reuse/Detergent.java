// reuse/Detergent.java

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() {append(" dilute()");}
	public void apply() {append(" apply()");}
	public void scrub() {append(" scrub()");}

	@Override
	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
} 

//extends关键字定义子类
public class Detergent extends Cleanser {
	@Override
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); //调用基类的scrub函数
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println(" Test base class: ");
		//调用基类main函数的方法
		Cleanser.main(args);
	}
}