package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Another test service.
 */
@Service
public class AnotherTestService {

	@Autowired
	private TargetService targetService;

	public void test() {
		targetService.sayHello();
	}

}
