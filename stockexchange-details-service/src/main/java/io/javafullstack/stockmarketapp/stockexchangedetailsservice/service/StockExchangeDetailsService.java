package io.javafullstack.stockmarketapp.stockexchangedetailsservice.service;

import java.util.List;

import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.CompanyDetailsDTO;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.StockExchangeDetailsDTO;

public interface StockExchangeDetailsService {
	StockExchangeDetailsDTO findStockExchangeById(Integer stockExchangeId) throws Exception;
	List<StockExchangeDetailsDTO> findAllStockExchanges() throws Exception;
	StockExchangeDetailsDTO addNewStockExchange(StockExchangeDetailsDTO stockExchangeDetailsDTO) throws Exception;
	List<CompanyDetailsDTO> findCompaniesByStockExchangeId(Integer stockExchangeId) throws Exception;
}
