class Value {
	int i;
}



public class EqualsMethod {
	public static void main(String[] args){
		Integer n1 = 128;
		Integer n2 = 128;
		System.out.println(n1.equals(n2));

		Integer n3 = 46;
		Integer n4 = 47;
		System.out.println(n3.equals(n4));
		//equals方法比较对象的引用

		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
	}
}