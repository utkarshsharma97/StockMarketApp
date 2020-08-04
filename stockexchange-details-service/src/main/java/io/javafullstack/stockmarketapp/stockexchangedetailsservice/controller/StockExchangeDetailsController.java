package io.javafullstack.stockmarketapp.stockexchangedetailsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.CompanyDetailsDTO;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.StockExchangeDetailsDTO;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.service.StockExchangeDetailsService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/stockexchange")
public class StockExchangeDetailsController {
	
	@Autowired
	StockExchangeDetailsService stockExchangeDetailsService;
	
	@RequestMapping(value = "/{stockExchangeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchangeDetailsDTO findStockExchangeById(@PathVariable Integer stockExchangeId) throws Exception {
		return stockExchangeDetailsService.findStockExchangeById(stockExchangeId);
	}
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchangeDetailsDTO> findAllStockExchanges() throws Exception {
		return stockExchangeDetailsService.findAllStockExchanges();
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public StockExchangeDetailsDTO addNewStockExchange(@RequestBody StockExchangeDetailsDTO stockExchangeDetailsDTO) throws Exception {
		return stockExchangeDetailsService.addNewStockExchange(stockExchangeDetailsDTO);
	}
	@RequestMapping(value = "/companylist/{stockExchangeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CompanyDetailsDTO> findCompaniesByStockExchangeId(@PathVariable Integer stockExchangeId) throws Exception {
		return stockExchangeDetailsService.findCompaniesByStockExchangeId(stockExchangeId);
	}
}