package com.github.haiyang.nidaye.domain;

/**
 * 责任模式的实现
 * 这只一个写着玩玩的实现，其实我自己也觉得责任模式来实现亲属关系不是一个最好的选择
 * 责任模式增加了实现的复杂性，而且亲属关系和责任模式有些不太一样
 * 在责任模式中的责任类型相当于关系的一个维度，在本例中这样的“维度”是不存在的
 * 团体可以根据某一特定的责任关系例如“上级-下级”来遍历全部的团体
 * 在本例中，遍历所有person实例需要用到几乎所有的关系类型
 * 
 * 对于RelationshipType的考虑：我只想在领域模型中持久基本的关系类型。
 * 基本的关系类型似乎只存在：亲子关系和婚姻关系。AB的兄弟关系可以用A的反向(亲子)到亲子到B来描述
 * 这样的好处在于，两个人之间只会存在唯一的关系路径。
 * 当然，坏处在于，遍历关系树变得很繁琐，
 * “我的兄弟”表述为：我的“父母亲(婚姻关系)”的孩子
 * “我的表兄”这样的关系需要这样去描述： 
 * 我的妈妈的爸爸的孩子的孩子
 * 
 * @author haiyang
 */
public class Relationship {	
	private Person from;
	private Person to;
	private String name;
	private RelationshipType type;
	

}
