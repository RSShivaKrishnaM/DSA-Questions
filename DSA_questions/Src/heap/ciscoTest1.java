package heap;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ciscoTest1 {
  //@RestController
  //@	
	// @(https)@GetMapping("")
	// method1
	// 
	// @PostMapping("")
	// method2
	
	
	//url : 8081, xml/json
	//jaxb
	//run
	//start
	//boot
	//url : 8080
 //@Component
// @SpringBootApplication
	// springContext :
	// springContext;
	
//@Configuration
	
	
//@Repository
//jdbc
// jdbc.("")	
//	

	public void exceutor() {
//		Executor ex = new CustomizedExecutor();
//		System.out.println("*****11"+this.getClass());
		
//		System.out.println("*****11"+this.getClass());
		Executor ex =  Executors.newFixedThreadPool(2);
		ex.execute(new Thread(new Thread1()));
		
//		mongodb.getIndex("").(userid).(usernam).()
	}
	
	class Thread1 implements Runnable{

		@Override
		public void run() {
			System.out.println("*****"+this.getClass());
		}
		
	}
	class CustomizedExecutor implements Executor{

		@Override
		public void execute(Runnable command) {
			
			
		}
		
	}
	
	public static void main(String[] args) {
		ciscoTest1 ci = new ciscoTest1();
		ci.exceutor();
	}
	
}
