//调用终结条件，然后调用finalize

import onjava.*;

class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	void checkIn() {
		checkedOut = false;
	}

	@Override //使用注解提示编译器这是一个覆写方法, 在这里覆写了finalize函数，让它只print，不进行内存回收
	protected void finalize() throws Throwable {
		if (checkedOut) {
			System.out.println("Error: checked out");
		}
	}
}
public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		//不去清理旧的BOOK，初始化一个新的
		new Book(true);
		//强制进行垃圾回收
		System.gc();
		new Nap(1);
	}
}