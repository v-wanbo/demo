package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	public static void main(String [] args){
		System.out.println("2019 /05 /08 下午 14点09 测试 ！！！！！！！！！");	
	}
	 
	@Test 
	public void contextLoads() {
 
		System.out.println("Hello Word ！！！！！");
	}

}
