class Tower {

	Stack st1, st2, st3;
	int size;

	public Tower(int N) {
		st1 = new Stack(N);
		st2 = new Stack(N);
		st3 = new Stack(N);
		size = N;

		try {
			for (int i = N; i > 0; i--)
				st1.push(i);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void solve() {
		print();
		move(st1, st3, st2, size);
	}

	private void to(Stack src, Stack dst) {
		try {
			dst.push(src.pop());
			print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void move(Stack src, Stack dst, Stack free, int size) {
		if (size == 1) {
			to(src, dst);
		} else if (size == 2) {
			to(src, free);
			to(src, dst);
			to(free, dst);
		} else {
			move(src, free, dst, size - 1);
			to(src, dst);
			move(free, dst, src, size - 1);
		}
	}

	public void print() {
		System.out.print("st1: "); st1.print();
		System.out.print("st2: "); st2.print();
		System.out.print("st3: "); st3.print();
		System.out.println("\n");
	}
}