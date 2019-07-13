package com.test.main;

import com.test.service.NoService;
import com.test.testinterface.TestService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x=10;
        TestService ts=(x)->{
        	for(int i=0;i<x;i++) {
        	System.out.println(i);
        	}
        };
        ts.printnos(10);
        NoService nService=new NoService();
        ts.printnos(10);
        ts=nService::printnos;
        nService.printagain(ts);
	}

}
