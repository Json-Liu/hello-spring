package com.yy.di.service.impl;

import org.springframework.stereotype.Component;
import com.yy.di.service.CompactDisc;
@Component
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Playing boys...Joson Liu.");
	}

}
