class Stack {
	private int[] stack;
	private int size;

	public Stack(int N) {
		stack = new int[N];
		size = -1;
	}

	public int pop() throws Exception {
		if (size < 0) {
			throw new Exception();
		}

		return stack[size--];
	}

	public void push(int value) throws Exception {
		if (size == stack.length - 1) {
			throw new Exception();
		}

		stack[++size] = value;
	}

	public void print() {
		for (int i = 0; i <= size; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println("");
	}
}