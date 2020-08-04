package io.javafullstack.stockmarketapp.companydetailsservice.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IPO")
public class CompanyIPOEntity {
	
	@Id
    @Column(name = "ID")
	private Integer companyIpoId;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "STOCK_EXCHANGE")
	private String StockExchange;
	
	@Column(name = "PRICE_PER_SHARE")
	private Integer pricePerShare;
	
	@Column(name = "TOTAL_SHARES")
	private Integer totalShares;
	
	@Column(name = "NEWDATE")
	private String date;

	public CompanyIPOEntity() {
		
	}
	
	public CompanyIPOEntity(Integer companyIpoId, String companyName, String stockExchange, Integer pricePerShare,
			Integer totalShares, String date) {
		super();
		this.companyIpoId = companyIpoId;
		this.companyName = companyName;
		StockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.date = date;
	}

	public Integer getCompanyIpoId() {
		return companyIpoId;
	}

	public void setCompanyIpoId(Integer companyIpoId) {
		this.companyIpoId = companyIpoId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}

	public Integer getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(Integer pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public Integer getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(Integer totalShares) {
		this.totalShares = totalShares;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
		
}
