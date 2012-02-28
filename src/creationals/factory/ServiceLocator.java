package creationals.factory;


public class ServiceLocator {
	
	public Father create(String name){
		
		if (name == "ChildA") {
			ChildA service = new ChildAImpl();
			return service;
		} else {
			ChildB service = new ChildBImpl();
			return service;
		}
		
	}

//	public Father create1(String name){
//		
//		if (name == "ChildA") {
//			ChildA service = new ChildAImpl();
//			return service;
//		}
//		if (name == "ChildB"){
//			ChildA service = new ChildAImpl();
//			return service;
//		}
//		return null;
//		
//	}
}
