public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = 128;
		Integer n2 = 128;
		System.out.println(n1==n2);

		Integer n3 = 47;
		Integer n4 = 47;
		System.out.println(n3==n4);
	}
}

//==运算符默认比较对象的引用，而不是对象本身

//例外的是[-128, 127] 之间的值用 == 和 != 比较也能能到正确的结果