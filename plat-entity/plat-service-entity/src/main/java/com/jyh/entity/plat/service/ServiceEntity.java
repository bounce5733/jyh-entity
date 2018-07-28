package com.jyh.entity.plat.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangyonghua
 * @date 2018年3月8日 下午3:19:55
 */
@Table(name = "service")
public class ServiceEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	private String id;

	private String appId;

	private String name;

	private String descn;

	private String updatedBy;

	private String updatedTime;

	private String createdBy;

	private String createdTime;

	private List<ApiEntity> apis = new ArrayList<ApiEntity>();

	public List<ApiEntity> getApis() {
		return apis;
	}

	public String getAppId() {
		return appId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
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

	public void setApis(List<ApiEntity> apis) {
		this.apis = apis;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
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
		return "ServiceEntity [id=" + id + ", appId=" + appId + ", name=" + name + ", descn=" + descn + ", updatedBy="
				+ updatedBy + ", updatedTime=" + updatedTime + ", createdBy=" + createdBy + ", createdTime="
				+ createdTime + ", apis=" + apis + "]";
	}

}
