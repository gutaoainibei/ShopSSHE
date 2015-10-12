package com.gt.model;
// Generated 2015-10-11 20:55:41 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * Busorder generated by hbm2java
 */
public class Busorder implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 673465494281976285L;
	private Integer id;
	private String name;
	private String phone;
	private String remark;
	private Date date;
	private BigDecimal total;
	private String post;
	private String address;
	private Status status;
	private User user;
	private Set<Sorder> sorderSet;
	
	


	public Set<Sorder> getSorderSet() {
		return sorderSet;
	}

	public void setSorderSet(Set<Sorder> sorderSet) {
		this.sorderSet = sorderSet;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Busorder [id=" + id + ", name=" + name + ", phone=" + phone + ", remark=" + remark + ", date=" + date
				+ ", total=" + total + ", post=" + post + ", address=" + address + ", status=" + status + ", user="
				+ user + ", sorderSet=" + sorderSet + "]";
	}

	
}
