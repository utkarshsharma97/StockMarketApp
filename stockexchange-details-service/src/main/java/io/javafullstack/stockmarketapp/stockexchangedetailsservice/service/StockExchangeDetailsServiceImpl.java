package io.javafullstack.stockmarketapp.stockexchangedetailsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dao.StockExchangeDetailsRepository;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dao.entities.StockExchangeEntity;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.CompanyDetailsDTO;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.StockExchangeDetailsDTO;
import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto.StockExchangeModelMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StockExchangeDetailsServiceImpl implements StockExchangeDetailsService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private StockExchangeModelMapper stockExchangeModelMapper;
	
	@Autowired
	private StockExchangeDetailsRepository stockExchangeDetailsRepository;
	
	@Value("${company.url}")
    private String companyDetailsServiceURL;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StockExchangeDetailsServiceImpl.class);

	@Override
	public StockExchangeDetailsDTO findStockExchangeById(Integer stockExchangeId) throws Exception {
		LOGGER.info("Fetching Stock Exchange details for Stock Exchange Id: {}", stockExchangeId);
		Optional<StockExchangeEntity> stockExchangeEntity = stockExchangeDetailsRepository.findById(stockExchangeId);	
		StockExchangeDetailsDTO stockExchangeDetailsDTO = null;

        if (stockExchangeEntity.isPresent()) {
        	stockExchangeDetailsDTO = stockExchangeModelMapper.toStockExchangeDTO(stockExchangeEntity.get());
        }

        return stockExchangeDetailsDTO;
	}

	@Override
	public List<StockExchangeDetailsDTO> findAllStockExchanges() throws Exception {
		LOGGER.info("Fetching all Stock Exchange details ");
		
		List<StockExchangeEntity> stockExchangeEntities = stockExchangeDetailsRepository.findAll();
		
		StockExchangeDetailsDTO stockExchangeDetailsDTO = null;
		
		List<StockExchangeDetailsDTO> stockExchangeDetailsDTOs = new ArrayList<>();
		for(StockExchangeEntity stockExchangeEntity : stockExchangeEntities) {
			stockExchangeDetailsDTO = stockExchangeModelMapper.toStockExchangeDTO(stockExchangeEntity);
			stockExchangeDetailsDTOs.add(stockExchangeDetailsDTO);
		}
		return stockExchangeDetailsDTOs;
	}

	@Override
	public StockExchangeDetailsDTO addNewStockExchange(StockExchangeDetailsDTO stockExchangeDetailsDTO) throws Exception {
		StockExchangeEntity stockExchangeEntity = stockExchangeModelMapper.toStockExchangeEntity(stockExchangeDetailsDTO);
		stockExchangeDetailsRepository.save(stockExchangeEntity);
		return stockExchangeDetailsDTO;
		
	}

	@Override
	public List<CompanyDetailsDTO> findCompaniesByStockExchangeId(Integer stockExchangeId) throws Exception {
		ResponseEntity <CompanyDetailsDTO[]> responseEntity = restTemplate.getForEntity(companyDetailsServiceURL + "stockexchange/"+stockExchangeId , CompanyDetailsDTO[].class);
		List<CompanyDetailsDTO> companyDetailsDTOs=Arrays.asList(responseEntity.getBody());
		return companyDetailsDTOs;
	}
	
}
