package com.jyh.entity.plat.attach;

import java.io.Serializable;

/**
 * 文件元信息
 * 
 * @author jiangyonghua
 * @date 2017年10月11日 上午10:16:56
 */
public class FileMeta implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fileid;// 文件服务器唯一标识

	private String appid;

	private String fileName;

	private String fileExt;

	private int fileSize;// 字节

	private String createdTime;

	public String getFileid() {
		return fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
