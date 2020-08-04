package io.javafullstack.stockmarketapp.companydetailsservice.dto;

public class CompanyIPODetailsDTO {
	
	private Integer companyIpoId;
	private String companyName;
	private String StockExchange;
	private Integer pricePerShare;
	private Integer totalShares;
	private String date;

	public CompanyIPODetailsDTO() {
		
	}
	
	public CompanyIPODetailsDTO(Integer companyIpoId, String companyName, String stockExchange, Integer pricePerShare,
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
