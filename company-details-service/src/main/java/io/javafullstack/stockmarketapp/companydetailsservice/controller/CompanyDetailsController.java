package io.javafullstack.stockmarketapp.companydetailsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyDetailsDTO;
import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyIPODetailsDTO;
import io.javafullstack.stockmarketapp.companydetailsservice.service.CompanyDetailsService;

@RestController
@RequestMapping("/company")
public class CompanyDetailsController {
	
	@Autowired
	CompanyDetailsService companyDetailsService;
	
	@RequestMapping(value = "/{companyId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CompanyDetailsDTO findCompanyById(@PathVariable Integer companyId) throws Exception {
		return companyDetailsService.findCompanyById(companyId);
	}
	@RequestMapping(value = "/name/{companyName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CompanyDetailsDTO> findByCompanyNameStartingWith(@PathVariable String companyName) throws Exception {
		return companyDetailsService.findByCompanyNameStartingWith(companyName);
	}
	@RequestMapping(value = "/ipo/{companyId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CompanyIPODetailsDTO findCompanyIPODetails(@PathVariable Integer companyId) throws Exception {
		return companyDetailsService.findCompanyIPODetails(companyId);
	}
	@RequestMapping(value = "/sector/{sectorId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CompanyDetailsDTO> findCompanyBySectorId(@PathVariable Integer sectorId) throws Exception {
		return companyDetailsService.findCompanyBySectorId(sectorId);
	}
	@RequestMapping(value = "/stockexchange/{stockexchangeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CompanyDetailsDTO> findCompanyByStockExchangeId(@PathVariable Integer stockexchangeId) throws Exception {
		return companyDetailsService.findCompanyByStockExchangeId(stockexchangeId);
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CompanyDetailsDTO addNewCompany(@RequestBody CompanyDetailsDTO companyDetailsDTO) throws Exception {
		return companyDetailsService.addNewCompany(companyDetailsDTO);
	}
}
