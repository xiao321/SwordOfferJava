package ChapterTwo;

public class Singleton2 {
	
	private static Singleton2 instance;
	private static Object object=new Object();
	
	private Singleton2(){
		
	}
	
	public static Singleton2 getInstance(){
		synchronized(object){
			if(instance==null){
				instance=new Singleton2();
			}
		}		
		return instance;
	}

}
