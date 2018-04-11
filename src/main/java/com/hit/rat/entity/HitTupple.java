package com.hit.rat.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HitTupple")
public class HitTupple {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String fileName;	
	private String hitRatioRun1;
	private String hitRatioRun2;
	private String hitRun1;
	private String hitRun2;
	private Date arrivalTime;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getHitRatioRun1() {
		return hitRatioRun1;
	}
	public void setHitRatioRun1(String hitRatioRun1) {
		this.hitRatioRun1 = hitRatioRun1;
	}
	public String getHitRatioRun2() {
		return hitRatioRun2;
	}
	public void setHitRatioRun2(String hitRatioRun2) {
		this.hitRatioRun2 = hitRatioRun2;
	}
	public String getHitRun1() {
		return hitRun1;
	}
	public void setHitRun1(String hitRun1) {
		this.hitRun1 = hitRun1;
	}
	public String getHitRun2() {
		return hitRun2;
	}
	public void setHitRun2(String hitRun2) {
		this.hitRun2 = hitRun2;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((hitRatioRun1 == null) ? 0 : hitRatioRun1.hashCode());
		result = prime * result + ((hitRatioRun2 == null) ? 0 : hitRatioRun2.hashCode());
		result = prime * result + ((hitRun1 == null) ? 0 : hitRun1.hashCode());
		result = prime * result + ((hitRun2 == null) ? 0 : hitRun2.hashCode());
		result = prime * result + id;
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
		HitTupple other = (HitTupple) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (hitRatioRun1 == null) {
			if (other.hitRatioRun1 != null)
				return false;
		} else if (!hitRatioRun1.equals(other.hitRatioRun1))
			return false;
		if (hitRatioRun2 == null) {
			if (other.hitRatioRun2 != null)
				return false;
		} else if (!hitRatioRun2.equals(other.hitRatioRun2))
			return false;
		if (hitRun1 == null) {
			if (other.hitRun1 != null)
				return false;
		} else if (!hitRun1.equals(other.hitRun1))
			return false;
		if (hitRun2 == null) {
			if (other.hitRun2 != null)
				return false;
		} else if (!hitRun2.equals(other.hitRun2))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HitTupple [id=" + id + ", fileName=" + fileName + ", hitRatioRun1=" + hitRatioRun1 + ", hitRatioRun2="
				+ hitRatioRun2 + ", hitRun1=" + hitRun1 + ", hitRun2=" + hitRun2 + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	
}
