package basics;
class Car implements Runnable{
	  public  void run() {
	    
	    synchronized(this) {
	      try {
	        System.out.println(Thread.currentThread().getName() +" Car is in Parking lot");
	        Thread.sleep(2000);
	        System.out.println(Thread.currentThread().getName() +" can get into the car");
	        Thread.sleep(2000);
	        System.out.println(Thread.currentThread().getName() +" can drive the car");
	        Thread.sleep(2000);
	        System.out.println(Thread.currentThread().getName() +" can park the car");
	      }catch(InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	    
	    
	  }
	}
public class LaunchCar {
	public static void main(String[] args) {
	    
	    Car c = new Car();
	    
	    Thread t1 = new Thread(c);
	    Thread t2 = new Thread(c);
	    Thread t3 = new Thread(c);
	    
	    t1.setName("child1");
	    t2.setName("child2");
	    t3.setName("child3");

	    t1.start();
	    t2.start();
	    t3.start();
	  }


}
