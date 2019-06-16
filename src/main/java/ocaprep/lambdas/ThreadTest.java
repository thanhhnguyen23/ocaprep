package ocaprep.lambdas;

public class ThreadTest{

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Old Java Way");
			}
		};
		
		Runnable r2 = () -> {
			System.out.println("New Java Way");
		};

		new Thread(r1).start();
		new Thread(r2).start();
	}
}
