package com.entities;
// Generated 7 avr. 2018 11:52:32 by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Offday generated by hbm2java
 */
@Entity
@Table(name = "offday", catalog = "java_project")
public class Offday implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private OffdayId id;

	public Offday() {
	}

	public Offday(OffdayId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nurseryName", column = @Column(name = "nurseryName", nullable = false, length = 30)),
			@AttributeOverride(name = "offDate", column = @Column(name = "offDate", nullable = false, length = 10)),
			@AttributeOverride(name = "halfday", column = @Column(name = "halfday", nullable = false, length = 9)) })
	public OffdayId getId() {
		return this.id;
	}

	public void setId(OffdayId id) {
		this.id = id;
	}

}