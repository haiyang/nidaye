package com.github.haiyang.nidaye.domain;

import java.util.Date;
import java.util.List;

public class Person {
	private Date bdate;
	private String name;
	private Sex sex;
	private List<Relationship> fromRelationships;
	private List<Relationship> toRelationships;
	public enum Sex {
		MALE, FEMALE;
	}
	

}