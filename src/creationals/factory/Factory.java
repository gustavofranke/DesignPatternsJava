package creationals.factory;

public class Factory {

	private static Factory instance;
	
	private Factory(){
		
	}
	public static Factory getInstance(){
		
		if(instance==null){
			return new Factory();
		}
		return instance;
	}
	
	public static Father newChildA(){
		Father service = new ChildAImpl();
		return service;
	}
	
	public static Father newChildB(){
		Father service = new ChildBImpl();
		return service;
	}
}
