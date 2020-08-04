package io.javafullstack.stockmarketapp.stockexchangedetailsservice.dto;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dao.entities.StockExchangeEntity;


@Component
public class StockExchangeModelMapper {
	 public StockExchangeDetailsDTO toStockExchangeDTO(StockExchangeEntity stockExchangeEntity) {
		 ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 StockExchangeDetailsDTO stockExchangeDetailsDTO = mapper.map(stockExchangeEntity, StockExchangeDetailsDTO.class);
		 return stockExchangeDetailsDTO;
	 }
	 public StockExchangeEntity toStockExchangeEntity(StockExchangeDetailsDTO stockExchangeDetailsDTO) {
		 ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 StockExchangeEntity stockExchangeEntity = mapper.map(stockExchangeDetailsDTO, StockExchangeEntity.class);
		 return stockExchangeEntity;
	 }
}
