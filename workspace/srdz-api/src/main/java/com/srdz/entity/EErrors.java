package com.srdz.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.opensymphony.xwork2.util.Key;

/**
 * 系统用户表
 */
@TableName("e_error")
public class EErrors{

    private Long logid;

    private String classname;

    private String msg;
    
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