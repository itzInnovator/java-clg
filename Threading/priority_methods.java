/* 
 * Showcasing usage of setPriority() and getPriority() methods in Multithreading
*/

public class priority_methods extends Thread {

    public void run() {
		System.out.println("Running the thread!");
	}

	public static void main(String[] args) {
		
		priority_methods t1 = new priority_methods();
		priority_methods t2 = new priority_methods();
		priority_methods t3 = new priority_methods();

		System.out.println("Thread Priority of t1 : "+t1.getPriority());
		System.out.println("Thread Priority of t2 : "+t2.getPriority());
		System.out.println("Thread Priority of t3 : "+t3.getPriority());

		t1.setPriority(9);
		t2.setPriority(4);
		t3.setPriority(5);

		System.out.println("Thread Priority of t1 : "+t1.getPriority());
		System.out.println("Thread Priority of t2 : "+t2.getPriority());
		System.out.println("Thread Priority of t3 : "+t3.getPriority());

		System.out.println("Currently executing the thread : "+Thread.currentThread().getName());
		System.out.println("Priority of main thread : "+Thread.currentThread().getPriority());

	}
}