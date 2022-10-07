package singleton;

public class DemoMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Se voc� ver o mesmo valor, ent�o o singleton foi reusado! "
				+ "Se voc� ver um valor diferente, ent�o 2 singletons foram criados! " + "RESULT: " + "\n");
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
