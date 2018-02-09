package com.srdz.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 系统用户表
 */
@SuppressWarnings("serial")
@TableName("e_errors")
public class EErrors extends Model<EErrors> {
	/** 指定主键 */
	@Override
	protected Serializable pkVal() {
		return this.logid;
	}
	@TableId(type = IdType.AUTO)
	private Long logid;
	
	@TableField(value = "ClassName")
	private String classname;

	@TableField(value = "Msg")
	private String msg;

	@TableField(value = "CreateTime")
	private Date createtime;

	public Long getLogid() {
		return logid;
	}

	public void setLogid(Long logid) {
		this.logid = logid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname == null ? null : classname.trim();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg == null ? null : msg.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}