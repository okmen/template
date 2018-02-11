package com.srdz.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author max
 * @since 2018-02-11
 */
@TableName("u_users")
public class UUsers extends Model<UUsers> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "UserID", type = IdType.AUTO)
    private Long UserID;
    private String PassWord;
    private String MobilePhone;
    private Integer MobileBind;
    private Integer Status;
    private Long Identity;
    private String UserImg;
    private String NickName;
    private String Email;
    private Date CreateTime;
    private String Sign;
    private Date Birthday;
    private Long UpUserId;
    private Long SourseUserId;


    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    public Integer getMobileBind() {
        return MobileBind;
    }

    public void setMobileBind(Integer MobileBind) {
        this.MobileBind = MobileBind;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public Long getIdentity() {
        return Identity;
    }

    public void setIdentity(Long Identity) {
        this.Identity = Identity;
    }

    public String getUserImg() {
        return UserImg;
    }

    public void setUserImg(String UserImg) {
        this.UserImg = UserImg;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getSign() {
        return Sign;
    }

    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public Long getUpUserId() {
        return UpUserId;
    }

    public void setUpUserId(Long UpUserId) {
        this.UpUserId = UpUserId;
    }

    public Long getSourseUserId() {
        return SourseUserId;
    }

    public void setSourseUserId(Long SourseUserId) {
        this.SourseUserId = SourseUserId;
    }

    @Override
    protected Serializable pkVal() {
        return this.UserID;
    }

    @Override
    public String toString() {
        return "UUsers{" +
        "UserID=" + UserID +
        ", PassWord=" + PassWord +
        ", MobilePhone=" + MobilePhone +
        ", MobileBind=" + MobileBind +
        ", Status=" + Status +
        ", Identity=" + Identity +
        ", UserImg=" + UserImg +
        ", NickName=" + NickName +
        ", Email=" + Email +
        ", CreateTime=" + CreateTime +
        ", Sign=" + Sign +
        ", Birthday=" + Birthday +
        ", UpUserId=" + UpUserId +
        ", SourseUserId=" + SourseUserId +
        "}";
    }
}
