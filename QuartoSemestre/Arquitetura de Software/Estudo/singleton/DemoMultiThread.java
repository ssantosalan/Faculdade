package singleton;

public class DemoMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Se você ver o mesmo valor, então o singleton foi reusado! "
				+ "Se você ver um valor diferente, então 2 singletons foram criados! " + "RESULT: " + "\n");
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
	}

	static class ThreadFoo implements Runnable {

		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);
		}

	}

	static class ThreadBar implements Runnable {

		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);

		}

	}

}
