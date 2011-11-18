package com.github.haiyang.nidaye.domain;

import java.util.ArrayList;
import java.util.List;

public class FamilyTitle {

	private List<RelationshipType> relationshipTypes = new ArrayList<RelationshipType>();

	public void addRelationship(RelationshipType r) {
		relationshipTypes.add(r);
	}	

	/**
	 * eg:我是你表哥
	 * @return
	 */
	public String getTitle() {
		return null;
	}

	/**
	 * eg:我是你妈妈的爸爸的弟弟的儿子的儿子
	 * @return
	 */
	public String getFullTitle() {
		return null;
	}

}
