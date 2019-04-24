package com.app.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * @author pradeep
 *
 */
@Entity
@Table(name="saleOrderTab")
public class SaleOrder {
	
	@Id
	@GeneratedValue(generator="saleOrder")
	@GenericGenerator(name="saleOrder",strategy="increment")
	@Column(name="sid")
  private Integer sid;
	 private String oCode;
	@Column(name="shipMode")
  private String sMode;
	@Column(name="sCustomer")
  private String sCust;
	@Column(name="sRefNo")
  private String refNo;
	@Column(name="sStockMode")
  private String stockMode;
	@Column(name="sStockSource")
  private String stockSource;
	@Column(name="sDefaultStatus")
  private String defaultStatus;
	@Column(name="salewdesc")
  private String sdesc;
	
	
	
	public SaleOrder(Integer sid) {
		super();
		this.sid = sid;
		
		
	}
	
	public SaleOrder(Integer sid, String oCode, String sMode, String sCust, String refNo, String stockMode,
			String stockSource, String defaultStatus, String desc) {
		super();
		this.sid = sid;
		this.oCode = oCode;
		this.sMode = sMode;
		this.sCust = sCust;
		this.refNo = refNo;
		this.stockMode = stockMode;
		this.stockSource = stockSource;
		this.defaultStatus = defaultStatus;
		this.sdesc = sdesc;
	}
	
	public SaleOrder() {
		super();
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	
	public String getoCode() {
		return oCode;
	}

	public void setoCode(String oCode) {
		this.oCode = oCode;
	}

	public String getsMode() {
		return sMode;
	}
	public void setsMode(String sMode) {
		this.sMode = sMode;
	}
	public String getsCust() {
		return sCust;
	}
	public void setsCust(String sCust) {
		this.sCust = sCust;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getStockMode() {
		return stockMode;
	}
	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}
	public String getStockSource() {
		return stockSource;
	}
	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}
	public String getDefaultStatus() {
		return defaultStatus;
	}
	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	public String getDesc() {
		return sdesc;
	}
	public void setDesc(String desc) {
		this.sdesc = sdesc;
	}
	@Override
	public String toString() {
		return "SaleOrder [sid=" + sid + ", oCode=" + oCode + ", sMode=" + sMode + ", sCust=" + sCust + ", refNo="
				+ refNo + ", stockMode=" + stockMode + ", stockSource=" + stockSource + ", defaultStatus="
				+ defaultStatus + ", sdesc=" + sdesc + "]";
	}
	
	
	
	
	
	
	
}
