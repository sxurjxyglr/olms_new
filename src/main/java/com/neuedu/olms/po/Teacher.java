package com.neuedu.olms.po;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.Length;

public class Teacher {
	private Long id;
	
	@NotEmpty(message="手机号不能为空")
	@Pattern(regexp="^1[0-9]{10}$",message="手机号格式错误")
	private String tel;
	
	@NotEmpty(message="密码不能为空")
	@Length(min=6,message="密码长度最少为六位")
	private String pwd;
	
	@NotEmpty(message="用户名不能为空")
	private String realName;
	
	
	@NotNull(message="性别不能为空")
	private Integer gender;
	
	//@NotNull表示不能不传   @NotEmpty表示不能为空
	@NotNull(message="手机号不能为空")
	@Email(message="email 格式不合法")
	private String email;
	
	@NotNull(message="学位不能为空")
	private String degree;
	//用户的身份令牌
	private Token tokenEntity;
	
	private String desc;
	
	private Date createTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	public Token getTokenEntity() {
		return tokenEntity;
	}
	public void setTokenEntity(Token tokenEntity) {
		this.tokenEntity = tokenEntity;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tel=" + tel + ", pwd=" + pwd + ", realName=" + realName + ", gender=" + gender
				+ ", email=" + email + ", degree=" + degree + ", tokenEntity=" + tokenEntity + ", desc=" + desc
				+ ", createTime=" + createTime + "]";
	}
	
	
}
