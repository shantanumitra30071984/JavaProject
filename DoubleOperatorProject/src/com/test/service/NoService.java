package com.test.service;

import com.test.testinterface.TestService;

public class NoService {
public void printnos(int n) {
	for(int i=1;i<n;i++) {
		System.out.println(i);
	}
}

public void printagain(TestService ts) {
	System.out.println("print again");
	ts=(x)->{
		for(int i=1;i<x;i++) {
			System.out.println(i);
		}
	};
	ts.printnos(5);
	
}
}
