package com.jyh.entity.plat.service;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangyonghua
 * @date 2018年3月8日 下午3:22:00
 */
@Table(name = "api")
public class ApiEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	private String id;

	private String serviceId;

	private String name;

	private String method;

	private String path;

	private String param;

	private String data;

	private String descn;

	private String updatedBy;

	private String updatedTime;

	private String createdBy;

	private String createdTime;

	public String getCreatedBy() {
		return createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public String getData() {
		return data;
	}

	public String getDescn() {
		return descn;
	}

	public String getId() {
		return id;
	}

	public String getMethod() {
		return method;
	}

	public String getName() {
		return name;
	}

	public String getParam() {
		return param;
	}

	public String getPath() {
		return path;
	}

	public String getServiceId() {
		return serviceId;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public String toString() {
		return "ApiEntity [id=" + id + ", serviceId=" + serviceId + ", name=" + name + ", method=" + method + ", path="
				+ path + ", param=" + param + ", data=" + data + ", descn=" + descn + ", updatedBy=" + updatedBy
				+ ", updatedTime=" + updatedTime + ", createdBy=" + createdBy + ", createdTime=" + createdTime + "]";
	}

}
