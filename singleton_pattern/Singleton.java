package singleton_pattern;

public class Singleton {
	private volatile static Singleton uniqueInstance ; // lazy instantiation
//  private static Singleton uniqueInstance = new Singleton();
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if(uniqueInstance == null)
				uniqueInstance = new Singleton();
			}
		}
		return uniqueInstance;
	}
	
	//rest of the code....
}
