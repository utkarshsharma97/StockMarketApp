package io.javafullstack.stockmarketapp.stockexchangedetailsservice.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STOCKEXCHANGE")
public class StockExchangeEntity {
	
    @Id
    @Column(name = "ID")
    private Integer stockexchangeId;

    @Column(name = "STOCK_EXCHANGE_NAME")
    private String stockExchangeName;

    @Column(name = "BRIEF_WRITE_UP")
    private String briefWriteup;

    @Column(name = "CONTACT_ADDRESS")
    private String contactAddress;
    
    @Column(name = "REMARKS")
    private String remarks;
    
    public StockExchangeEntity() {
    	
    }

	public StockExchangeEntity(Integer stockexchangeId, String stockExchangeName, String briefWriteup,
			String contactAddress, String remarks) {
		super();
		this.stockexchangeId = stockexchangeId;
		this.stockExchangeName = stockExchangeName;
		this.briefWriteup = briefWriteup;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}

	public Integer getStockExchangeId() {
		return stockexchangeId;
	}

	public void setStockExchangeId(Integer stockexchangeId) {
		this.stockexchangeId = stockexchangeId;
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

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}    
}

