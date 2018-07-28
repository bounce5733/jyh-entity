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
@Table(name = "app_type")
public class AppTypeEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	private String id;

	private String name;

	private String deleted = "F";

	private String descn;

	private String updatedBy;

	private String updatedTime;

	private String createdBy;

	private String createdTime;

	private List<AppEntity> children = new ArrayList<AppEntity>();

	public List<AppEntity> getChildren() {
		return children;
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setChildren(List<AppEntity> children) {
		this.children = children;
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

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public String toString() {
		return "AppTypeEntity [id=" + id + ", name=" + name + ", deleted=" + deleted + ", descn=" + descn
				+ ", updatedBy=" + updatedBy + ", updatedTime=" + updatedTime + ", createdBy=" + createdBy
				+ ", createdTime=" + createdTime + "]";
	}

}
