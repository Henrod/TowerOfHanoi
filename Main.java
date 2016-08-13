import java.util.*;

class Main {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		Tower tower = new Tower(N);
		tower.solve();
	}
}
