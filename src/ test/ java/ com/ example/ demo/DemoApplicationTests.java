package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	
	 /*  17:18  */
	@Test 
	public void contextLoads() {
		int i=1/0;
		System.out.println("Hello Word ！！！！！");
	}

}
