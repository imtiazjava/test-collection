package com.itc.main;

public class Operation {
	
	
	public int add(int a,int b) {
	    if(a<0 || b<0)
	    	return -1;
	    else if(a==0 || b==0)
	    	return -2;
	    else 
		return a+b;
	}

}
