package com.offcn.model;

public class Customer {
	@Override
	public String toString() {
		return "Customer [CID=" + CID + ", user=" + user + ", password="
				+ password + ", contact=" + contact + ", email=" + email
				+ ", sex=" + sex + ", flay=" + flay + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + "]";
	}
	private int  CID;        //顾客编码';
	 private String user;      //'客户名称';
	 private String password;  //密码
	 private String contact;   //联系方法
	  private String email;   //'email地址',
	  private String sex;    //性别
	  private String flay;        //有效标识
	  private String createTime;  //创建时间,
	  private String modifyTime;  //修改时间
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFlay() {
		return flay;
	}
	public void setFlay(String flay) {
		this.flay = flay;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	  
}
