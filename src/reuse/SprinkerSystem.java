//
// 组合语法
//

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}
	//toSring方法是类内提前定义过的方法，使用override注解进行覆盖
	//当一个对象被拼接时，比如字符串+对象，此时toString方法会被调用
	@Override
	public String toString() { return s;}
}

public class SprinkerSystem {
	private String valve1,valve2,valve3,valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	@Override
	public String toString() {
		return 
			"valve1 = " + valve1 + " " + 
			"valve2 = " + valve2 + " " + 
			"valve3 = " + valve3 + " " + 
			"valve4 = " + valve4 + "\n" + 
			"i = " + i + " " + " f = " + f + " " +
			"source = " + source;//此行会调用WaterSource的toString方法
	}
	public static void main(String[] args) {
		SprinkerSystem sprinklers = new SprinkerSystem();
		System.out.println(sprinklers);//此行会调用SprinkerSystem的toString方法
	}
}