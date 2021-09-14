package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Test service.
 */
@Service
public class TestService {

	@Autowired
	private TargetService targetService;

	public void test() {
		targetService.sayHello();
	}

}
