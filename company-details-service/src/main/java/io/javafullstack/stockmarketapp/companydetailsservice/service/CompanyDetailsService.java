package io.javafullstack.stockmarketapp.companydetailsservice.service;

import java.util.List;

import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyDetailsDTO;
import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyIPODetailsDTO;

public interface CompanyDetailsService {

	CompanyDetailsDTO findCompanyById(Integer companyId) throws Exception;

	List<CompanyDetailsDTO> findByCompanyNameStartingWith(String companyName) throws Exception;

	CompanyIPODetailsDTO findCompanyIPODetails(Integer companyId) throws Exception;

	List<CompanyDetailsDTO> findCompanyBySectorId(Integer sectorId) throws Exception;

	List<CompanyDetailsDTO> findCompanyByStockExchangeId(Integer stockexchangeId) throws Exception;

	CompanyDetailsDTO addNewCompany(CompanyDetailsDTO companyDetailsDTO) throws Exception;

}
