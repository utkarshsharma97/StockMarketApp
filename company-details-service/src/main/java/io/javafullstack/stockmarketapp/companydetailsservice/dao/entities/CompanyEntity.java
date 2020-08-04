package io.javafullstack.stockmarketapp.companydetailsservice.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANIES")
public class CompanyEntity {
	
    @Id
    @Column(name = "ID")
    private Integer companyId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "TURNOVER")
    private float turnOver;

    @Column(name = "CEO")
    private String ceo;
    
    @Column(name = "BOARD_OF_DIR")
    private String boardOfDirectors;
    
    @Column(name = "STOCK_EXCHANGES")
	private String stockExchanges;
	
    @Column(name = "SECTOR_ID")
    private Integer sectorId;
	
    @Column(name = "WRITEUP")
    private String briefWriteup;
	
    @Column(name = "STOCKCODE")
    private String stockCode;
    
    @Column(name = "IPO")
	private Integer ipo;
    
    public CompanyEntity() {
    	
    }
    
	public CompanyEntity(Integer companyId, String companyName, float turnOver, String ceo, String boardOfDirectors,
			String stockExchanges, Integer sectorId, String briefWriteup, String stockCode, Integer ipo) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
		this.stockCode = stockCode;
		this.ipo = ipo;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public float getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(float turnOver) {
		this.turnOver = turnOver;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public Integer getSectorId() {
		return sectorId;
	}

	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public Integer getIpo() {
		return ipo;
	}

	public void setIpo(Integer ipo) {
		this.ipo = ipo;
	}
    
}
