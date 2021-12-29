package manish.com.corejava;

public class Exam1 {

	public static void main(String[] args) {

		Thread t = new Thread(new ThreadEx());
		t.start();
		
		Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };
        
        new Thread(task3).start();
        
        Interface1 i =  System.out::println;
        
        i.method1("Hello");
 
	}

}
