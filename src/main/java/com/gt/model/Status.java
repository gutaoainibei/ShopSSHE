package com.gt.model;
// Generated 2015-10-11 20:55:41 by Hibernate Tools 4.0.0

/**
 * Status generated by hbm2java
 */
public class Status implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6610954943486261560L;
	private Integer id;
	private String status;

	public Status(int i) {
		this.id = i;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
