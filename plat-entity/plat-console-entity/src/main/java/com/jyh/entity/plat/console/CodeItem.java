package com.jyh.entity.plat.console;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 编码子项
 * 
 * @author jiangyonghua
 * @date 2017年6月19日 下午5:35:12
 */
@Table(name = "sys_code_item")
public class CodeItem implements Comparable<CodeItem>, Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;// UUID主键
	private String pid;// 父主键
	private String name;// 名称
	private String type;// 所属类型
	private Integer sort;// 排序

	private String createdBy;// 创建人
	private String createdTime;// 创建时间
	private String updatedBy;// 更新人
	private String updatedTime;// 更新时间

	// 节点ID路径集合
	@Transient
	private List<String> path = new LinkedList<String>();

	private List<CodeItem> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<CodeItem> getChildren() {
		return children;
	}

	public void setChildren(List<CodeItem> children) {
		this.children = children;
	}

	public List<String> getPath() {
		return path;
	}

	public void setPath(List<String> path) {
		this.path = path;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 组装主键全路径
	 * 
	 * @param parentPath
	 *            父主键路径
	 */
	public void makePath(List<String> parentPath) {
		this.path.addAll(parentPath);
		this.path.add(this.id);
		if (this.children != null && this.children.size() > 0) {
			for (CodeItem code : this.children) {
				code.makePath(this.path);
			}
		}
	}

	/**
	 * 码表排序
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(CodeItem o) {
		if (this == o) {
			return 0;
		}
		if (o == null) {
			return 1;
		}
		return this.sort > o.sort ? 1 : this.sort == o.sort ? 0 : -1;
	}

	@Override
	public String toString() {
		return "CodeItem [id=" + id + ", pid=" + pid + ", name=" + name + ", type=" + type + ", sort=" + sort
				+ ", createdBy=" + createdBy + ", createdTime=" + createdTime + ", updatedBy=" + updatedBy
				+ ", updatedTime=" + updatedTime + ", path=" + path + ", children=" + children + "]";
	}

}
