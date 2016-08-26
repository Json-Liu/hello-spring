package com.yy.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yy.di.service.CompactDisc;

@Component
public class ConstructClazz {
	private CompactDisc cd;
	@Autowired
	public ConstructClazz(CompactDisc cd){
		this.cd = cd;
	}
}
