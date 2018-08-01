package com.provider.houhe.front.entity;

/**
 * 活动-投资比赛-排名信息
 * @author Administrator
 *
 */
public class ActivitiesInvestmentGameRankingInfo {

	private Integer id;//	Integer	11	Y	Y	N		id
	private Integer investorId;//	Integer	11	N	N	Y		投资人id
	private String investorLoginName;//	Varchar	200	N	N	Y		投资人登录名�? 
	private double investAmt;//	Double		N	N	Y		投资金额
	private Integer deleteState;//	Integer	2	N	N	N		删除状�?�：1=未删除，0=已删�?
	private Integer state;//	Integer	2	N	N	N	1	状�?�：1=活动�?0=非活�?
	private String createTime;//	Varchar	50	N	N	N	Null	创建时间
	private String modifyTime;//	Varchar	50	N	N	N	Null	修改时间
	private String area;//地域
	private String realName;//真实姓名
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInvestorId() {
		return investorId;
	}
	public void setInvestorId(Integer investorId) {
		this.investorId = investorId;
	}
	public String getInvestorLoginName() {
		return investorLoginName;
	}
	public void setInvestorLoginName(String investorLoginName) {
		this.investorLoginName = investorLoginName;
	}
	public double getInvestAmt() {
		return investAmt;
	}
	public void setInvestAmt(double investAmt) {
		this.investAmt = investAmt;
	}
	public Integer getDeleteState() {
		return deleteState;
	}
	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
}
