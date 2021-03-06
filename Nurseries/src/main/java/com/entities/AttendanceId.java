package com.entities;
// Generated 7 avr. 2018 11:52:32 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AttendanceId generated by hbm2java
 */
@Embeddable
public class AttendanceId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nurseryName;
	private int contractId;
	private Date attendanceDate;
	private String halfday;

	public AttendanceId() {
	}

	public AttendanceId(String nurseryName, int contractId, Date attendanceDate, String halfday) {
		this.nurseryName = nurseryName;
		this.contractId = contractId;
		this.attendanceDate = attendanceDate;
		this.halfday = halfday;
	}

	@Column(name = "nurseryName", nullable = false, length = 30)
	public String getNurseryName() {
		return this.nurseryName;
	}

	public void setNurseryName(String nurseryName) {
		this.nurseryName = nurseryName;
	}

	@Column(name = "contractId", nullable = false)
	public int getContractId() {
		return this.contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	@Column(name = "attendanceDate", nullable = false, length = 10)
	public Date getAttendanceDate() {
		return this.attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	@Column(name = "halfday", nullable = false, length = 9)
	public String getHalfday() {
		return this.halfday;
	}

	public void setHalfday(String halfday) {
		this.halfday = halfday;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AttendanceId))
			return false;
		AttendanceId castOther = (AttendanceId) other;

		return ((this.getNurseryName() == castOther.getNurseryName()) || (this.getNurseryName() != null
				&& castOther.getNurseryName() != null && this.getNurseryName().equals(castOther.getNurseryName())))
				&& (this.getContractId() == castOther.getContractId())
				&& ((this.getAttendanceDate() == castOther.getAttendanceDate())
						|| (this.getAttendanceDate() != null && castOther.getAttendanceDate() != null
								&& this.getAttendanceDate().equals(castOther.getAttendanceDate())))
				&& ((this.getHalfday() == castOther.getHalfday()) || (this.getHalfday() != null
						&& castOther.getHalfday() != null && this.getHalfday().equals(castOther.getHalfday())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNurseryName() == null ? 0 : this.getNurseryName().hashCode());
		result = 37 * result + this.getContractId();
		result = 37 * result + (getAttendanceDate() == null ? 0 : this.getAttendanceDate().hashCode());
		result = 37 * result + (getHalfday() == null ? 0 : this.getHalfday().hashCode());
		return result;
	}

}
