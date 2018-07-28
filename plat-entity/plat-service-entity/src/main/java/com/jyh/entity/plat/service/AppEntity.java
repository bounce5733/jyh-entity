package com.jyh.entity.plat.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangyonghua
 * @date 2018年2月9日 上午8:39:00
 */
@Table(name = "app")
public class AppEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	private String id;

	private String appid;

	private String name;

	private String pwd;

	private String owner;

	private String conf;

	private String deleted = "F";

	private String descn;

	private String updatedBy;

	private String updatedTime;

	private String createdBy;

	private String createdTime;

	private List<ServiceEntity> services = new ArrayList<ServiceEntity>();

	public String getAppid() {
		return appid;
	}

	public String getConf() {
		return conf;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public String getDeleted() {
		return deleted;
	}

	public String getDescn() {
		return descn;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public String getPwd() {
		return pwd;
	}

	public List<ServiceEntity> getServices() {
		return services;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public void setConf(String conf) {
		this.conf = conf;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setServices(List<ServiceEntity> services) {
		this.services = services;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public String toString() {
		return "AppEntity [id=" + id + ", appid=" + appid + ", name=" + name + ", pwd=" + pwd + ", owner=" + owner
				+ ", conf=" + conf + ", deleted=" + deleted + ", descn=" + descn + ", updatedBy=" + updatedBy
				+ ", updatedTime=" + updatedTime + ", createdBy=" + createdBy + ", createdTime=" + createdTime
				+ ", services=" + services + "]";
	}

}
