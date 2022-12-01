package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.SumService;

@Service(value = "SumService")
public class SumServiceImpl implements SumService{

	@Override
	public int sum(int x, int y) {		
		return x+y;
	}
}
