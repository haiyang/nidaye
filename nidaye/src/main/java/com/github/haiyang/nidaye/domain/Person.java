package com.github.haiyang.nidaye.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 离婚，非婚生子，同性恋结婚，变性人的情况还没有考虑
 * 
 * @author haiyang
 */
public class Person {
	public enum Sex {
		FEMALE, MALE;
	}

	private Date bdate;
	private Person father;
	private Person mother;

	private String name;

	private Sex sex;

	private Person spouse;

	public Date getBdate() {
		return bdate;
	}

	public Person getFather() {
		return father;
	}

	public Person getMother() {
		return mother;
	}

	public String getName() {
		return name;
	}

	public Sex getSex() {
		return sex;
	}

	public Person getSpouse() {
		return spouse;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	/**
	 * input bdate as string. eg: 19800101
	 * 
	 * @param bDate
	 */
	public void setBdate(String bDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = sdf.parse(bDate);
			this.bdate = date;
		} catch (ParseException e) {
			throw new IllegalArgumentException("bDate is invalid", e);
		}
	}

	/**
	 * input bdate as string. eg: 19800101 12:34:12
	 * 
	 * @param bDate
	 */
	public void setBTime(String bTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		try {
			Date date = sdf.parse(bTime);
			this.bdate = date;
		} catch (ParseException e) {
			throw new IllegalArgumentException("bDate is invalid", e);
		}
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

	/**
	 * 获取此人对另外一个人的称呼 TODO:实现算法：首先向上查找this和配偶的递归双亲顶点,然后向下遍历
	 * 
	 * @param person
	 * @return
	 */
	public String getTitle(Person person) {
		String title = null;
		if (person.equals(this.getFather())) {
			title = "爸爸";
		}
		if (person.equals(this.getMother())) {
			title = "妈妈";
		}
		if (person.equals(this.getSpouse())) {
			if (this.getSpouse().getSex().equals(Sex.FEMALE)) {
				title = "老公";
			} else {
				title = "老婆";
			}
		}
		return title;
	}

}