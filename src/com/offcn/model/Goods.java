package com.offcn.model;

import java.sql.Date;

public class Goods {
	 @Override
	public String toString() {
		return "Goods [goodsID=" + goodsID + ", goodsName=" + goodsName
				+ ", brand=" + brand + ", category=" + category
				+ ", goodsSize=" + goodsSize + ", color=" + color
				+ ", onshelfTime=" + onshelfTime + ", offshelfTime="
				+ offshelfTime + ", untiPrice=" + untiPrice + ", feature="
				+ feature + ", discription=" + discription + ", picture="
				+ picture + ", newIdt=" + newIdt + ", discountIdt="
				+ discountIdt + ", isMail=" + isMail + ", flay=" + flay
				+ ", createID=" + createID + ", createTime=" + createTime + "]";
	}
	private String goodsID;//'商品编码',
	  private String goodsName; //'商品名称',
	  private String brand;// '商品品牌',
	  private String category;// '商品类别',
	  private String goodsSize;// '商品尺码',
	  private String color; //'商品颜色',
	  private Date onshelfTime;  //'上架时间',
	  private Date offshelfTime;//下架时间
	  private double untiPrice; // '商品价格',
	  private String feature; //'商品特征',
	  private String discription;// '商品详细描述',
	  private String picture; //'商品主图片',
	  private String  newIdt;// '新品标识,1001：新品；1002：新品宣传首图；1003：新品宣传图；1004：普通商品'',',
	  private String discountIdt;// ''商品折扣标识，1001：促销广告品；1002：正品；1003：限时折扣品；1004：使用优惠券',
	  private String isMail;// '邮寄标识，1001：包邮；1002：不包邮''',
	  private String flay;// '新品标识，1001：新品；1002：新品宣传首图；1003：新品宣传图；1004：普通商品',
	  private String createID;//` '操作人员ID',
	  private String createTime;//` 建表时间
	 
	  public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getOnshelfTime() {
		return onshelfTime;
	}
	public void setOnshelfTime(Date onshelfTime) {
		this.onshelfTime = onshelfTime;
	}
	public Date getOffshelfTime() {
		return offshelfTime;
	}
	public void setOffshelfTime(Date offshelfTime) {
		this.offshelfTime = offshelfTime;
	}
	public double getUntiPrice() {
		return untiPrice;
	}
	public void setUntiPrice(double untiPrice) {
		this.untiPrice = untiPrice;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getNewIdt() {
		return newIdt;
	}
	public void setNewIdt(String newIdt) {
		this.newIdt = newIdt;
	}
	public String getDiscountIdt() {
		return discountIdt;
	}
	public void setDiscountIdt(String discountIdt) {
		this.discountIdt = discountIdt;
	}
	public String getIsMail() {
		return isMail;
	}
	public void setIsMail(String isMail) {
		this.isMail = isMail;
	}
	public String getFlay() {
		return flay;
	}
	public void setFlay(String flay) {
		this.flay = flay;
	}
	public String getCreateID() {
		return createID;
	}
	public void setCreateID(String createID) {
		this.createID = createID;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
