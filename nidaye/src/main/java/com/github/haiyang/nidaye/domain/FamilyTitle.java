package com.github.haiyang.nidaye.domain;

import java.util.ArrayList;
import java.util.List;

public class FamilyTitle {

	private List<RelationshipType> relationshipTypes = new ArrayList<RelationshipType>();

	public void addRelationship(RelationshipType r) {
		relationshipTypes.add(r);
	}	

	/**
	 * eg:��������
	 * @return
	 */
	public String getTitle() {
		return null;
	}

	/**
	 * eg:����������İְֵĵܵܵĶ��ӵĶ���
	 * @return
	 */
	public String getFullTitle() {
		return null;
	}

}
