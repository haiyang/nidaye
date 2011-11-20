package com.github.haiyang.nidaye.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 责任模式的实现
 * @author haiyang
 *
 */
public class Person {
	private Date bdate;
	private String name;
	private Sex sex;
	private List<Relationship> fromRelationships;

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public List<Relationship> getFromRelationships() {
		return fromRelationships;
	}

	public void setFromRelationships(List<Relationship> fromRelationships) {
		this.fromRelationships = fromRelationships;
	}

	public List<Relationship> getToRelationships() {
		return toRelationships;
	}

	public void setToRelationships(List<Relationship> toRelationships) {
		this.toRelationships = toRelationships;
	}

	private List<Relationship> toRelationships;

	public enum Sex {
		MALE, FEMALE;
	}

	/**
	 * input bdate as string. eg: 19800101
	 * @param bDate
	 */
	public void setBdateAsString(String bDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = sdf.parse(bDate);
			this.bdate = date;
		} catch (ParseException e) {
			throw new IllegalArgumentException("bDate is invalid", e);
		}
	}

}