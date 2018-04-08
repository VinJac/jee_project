package com.entities;
// Generated 7 avr. 2018 11:52:32 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Nursery generated by hbm2java
 */
@Entity
@Table(name = "nursery", catalog = "java_project")
public class Nursery implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nurseryName;
	private String passwd;

	public Nursery() {
	}

	public Nursery(String nurseryName, String passwd) {
		this.nurseryName = nurseryName;
		this.passwd = passwd;
	}

	@Id

	@Column(name = "nurseryName", unique = true, nullable = false, length = 50)
	public String getNurseryName() {
		return this.nurseryName;
	}

	public void setNurseryName(String nurseryName) {
		this.nurseryName = nurseryName;
	}

	@Column(name = "passwd", nullable = false, length = 30)
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nurseryName == null) ? 0 : nurseryName.hashCode());
		result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nursery other = (Nursery) obj;
		if (nurseryName == null) {
			if (other.nurseryName != null)
				return false;
		} else if (!nurseryName.equals(other.nurseryName))
			return false;
		if (passwd == null) {
			if (other.passwd != null)
				return false;
		} else if (!passwd.equals(other.passwd))
			return false;
		return true;
	}
}
