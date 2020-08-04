package io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto;

public class StockExchangeDetailsDTO {
	private Integer stockExchangeId;
	private String stockExchangeName;
	private String briefWriteup;
	private String contactAddress;
	private String remarks;
	
	public StockExchangeDetailsDTO() {
		
	}

	public StockExchangeDetailsDTO(Integer stockExchangeId, String stockExchangeName, String briefWriteup, String contactAddress,
			String remarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.briefWriteup = briefWriteup;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}

	public Integer getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(Integer stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	
}
