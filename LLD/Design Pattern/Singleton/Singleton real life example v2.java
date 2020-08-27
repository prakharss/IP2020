package com.java.examples;

import java.util.HashSet;
import java.util.Set;

//Client of ServiceNow
class A {
	public static void main(String[] args) {
		//Check whether this pincode exist in DB or not
		String pinCode="500084";
		boolean isValidPinCode=zipValidation.validate(pinCode);
		System.out.println(isValidPinCode);
	}
}

//ServiceNow
class ResourceInitializer {
    static ResourceInitializer r = null;
    private Set<String> zipCoder;
    
    private ResourceInitializer(){
        //create connection
        //db.query 
    	//using in-memory 
    	zipCoder=new HashSet<String>();
    	zipCoder.add("500081");
    	zipCoder.add("500084");
        //close
        //initializer
    }
    public static ResourceInitializer getInitializer() {
        if (r == null)
            r = new ResourceInitializer();
        return r;
    }
    public Set<String > getZipCoder(){
        return zipCoder;
    }
}

class zipValidation {
	public static boolean validate(String pincode) {
		ResourceInitializer r = ResourceInitializer.getInitializer();
		Set<String> zipCoder = r.getZipCoder();
		if (zipCoder.contains(pincode))
			return true;
		return false;
	}
}




