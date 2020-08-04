package io.javafullstack.stockmarketapp.companydetailsservice.dto;

import java.util.List;

public class CompanyDetailsDTO {
	private Integer companyId;
	private String companyName;
	private float turnOver;
	private String ceo;
	private String boardOfDirectors;
	private String stockExchanges;
	private String sectorId;
	private String briefWriteup;
	private Integer ipo;
	
	public CompanyDetailsDTO() {
		
	}
	
	public CompanyDetailsDTO(Integer companyId, String companyName, float turnOver, String ceo,
			String boardOfDirectors, String stockExchanges, String sectorId, String briefWriteup,
			String stockCode, Integer ipo) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
		this.ipo=ipo;
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

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public Integer getIpo() {
		return ipo;
	}

	public void setIpo(Integer ipo) {
		this.ipo = ipo;
	}
	
}
