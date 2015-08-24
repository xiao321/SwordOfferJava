package ChapterTwo;

public class Singleton3 {
	
	private static Singleton3 instance;
	private static Object object=new Object();
	private Singleton3(){
		
	}
	
	public Singleton3 getInstance(){
		if(instance==null){
			synchronized(object){
				if(instance==null){
					instance=new Singleton3();
				}
			}
		}
		
		return instance;
	}
	

}
