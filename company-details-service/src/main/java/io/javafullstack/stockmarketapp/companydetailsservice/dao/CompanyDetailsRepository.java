package io.javafullstack.stockmarketapp.companydetailsservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javafullstack.stockmarketapp.companydetailsservice.dao.entities.CompanyEntity;

@Repository
public interface CompanyDetailsRepository extends JpaRepository<CompanyEntity, Integer>{
	public List<CompanyEntity> findByCompanyNameStartingWith(String pattern);
	public List<CompanyEntity>findAllBySectorId(Integer sectorId);
}
