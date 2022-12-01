package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.SumService;

@SpringBootTest
public class SumTest {

	@Autowired
	SumService sumService;
	
	@Test
	public void testSum() {
		assertEquals(17, sumService.sum(10, 7));
	}
	
}
