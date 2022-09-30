package exercicio1;

public class Teste extends Thread {

	@Override
	public void run() {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
	
	public static void main(String[] args) {
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		Singleton s3 = Singleton.getInstance();
//
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		
		t1.start();
		t2.start();
	}

}
