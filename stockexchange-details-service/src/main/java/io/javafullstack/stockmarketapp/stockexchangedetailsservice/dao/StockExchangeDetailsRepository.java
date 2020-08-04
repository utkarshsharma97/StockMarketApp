package io.javafullstack.stockmarketapp.stockexchangedetailsservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javafullstack.stockmarketapp.stockexchangedetailsservice.dao.entities.StockExchangeEntity;

public interface StockExchangeDetailsRepository extends JpaRepository<StockExchangeEntity, Integer>{

}
