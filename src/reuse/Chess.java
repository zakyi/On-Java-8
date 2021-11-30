class Game {
	Game(int i) {
		System.out.println(" Game constructor ");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		
		super(11);  //删除此行编译器会报错，说明需要先调用基类的构造函数
		System.out.println("Chess constructor");
	}
	public static void	main(String[] args) {
		
		Chess x = new Chess();
	}
}