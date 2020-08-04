package io.javafullstack.stockmarketapp.companydetailsservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javafullstack.stockmarketapp.companydetailsservice.dao.CompanyDetailsRepository;
import io.javafullstack.stockmarketapp.companydetailsservice.dao.CompanyIPODetailsRepository;
import io.javafullstack.stockmarketapp.companydetailsservice.dao.entities.CompanyEntity;
import io.javafullstack.stockmarketapp.companydetailsservice.dao.entities.CompanyIPOEntity;
import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyDetailsDTO;
import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyIPODetailsDTO;
import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyIPOModelMapper;
import io.javafullstack.stockmarketapp.companydetailsservice.dto.CompanyModelMapper;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService{

	@Autowired
	CompanyDetailsRepository companyDetailsRepsitory;
	
	@Autowired
	CompanyIPODetailsRepository companyIPODetailsRepsitory;
	
	@Autowired
	CompanyModelMapper companyModelMapper;
	
	@Autowired
	CompanyIPOModelMapper companyIPOModelMapper;
	
	@Override
	public CompanyDetailsDTO findCompanyById(Integer companyId) throws Exception {
		Optional<CompanyEntity> companyEntity = companyDetailsRepsitory.findById(companyId);	
		CompanyDetailsDTO companyDetailsDTO = null;

        if (companyEntity.isPresent()) {
        	companyDetailsDTO = companyModelMapper.toCompanyDTO(companyEntity.get());
        }

        return companyDetailsDTO;
	}

	@Override
	public List<CompanyDetailsDTO> findByCompanyNameStartingWith(String companyName) throws Exception {
		List<CompanyEntity> companyEntities = companyDetailsRepsitory.findByCompanyNameStartingWith(companyName);	
		CompanyDetailsDTO companyDetailsDTO = null;
		List<CompanyDetailsDTO> companyDetailsDTOs = new ArrayList<>();

        if (!companyEntities.isEmpty()) {
        	for(CompanyEntity companyEntity : companyEntities) {
        		companyDetailsDTO = companyModelMapper.toCompanyDTO(companyEntity);
        		companyDetailsDTOs.add(companyDetailsDTO);
        	}	
        }
        return companyDetailsDTOs;
	}

	@Override
	public CompanyIPODetailsDTO findCompanyIPODetails(Integer companyId) throws Exception {
		Optional<CompanyEntity> companyEntity = companyDetailsRepsitory.findById(companyId);	
		CompanyDetailsDTO companyDetailsDTO = null;

        if (companyEntity.isPresent()) {
        	companyDetailsDTO = companyModelMapper.toCompanyDTO(companyEntity.get());
        }
        Integer companyIpo=companyDetailsDTO.getIpo();
        Optional<CompanyIPOEntity> companyIPOEntity = companyIPODetailsRepsitory.findById(companyIpo);	
        CompanyIPODetailsDTO companyIPODetailsDTO = null;

        if (companyIPOEntity.isPresent()) {
        	companyIPODetailsDTO = companyIPOModelMapper.toCompanyIPODTO(companyIPOEntity.get());
        }

        return companyIPODetailsDTO;
	}

	@Override
	public List<CompanyDetailsDTO> findCompanyBySectorId(Integer sectorId) throws Exception {
		List<CompanyEntity> companyEntities = companyDetailsRepsitory.findAllBySectorId(sectorId);
		CompanyDetailsDTO companyDetailsDTO = null;
		List<CompanyDetailsDTO> companyDetailsDTOs = new ArrayList<>();

        if (!companyEntities.isEmpty()) {
        	for(CompanyEntity companyEntity : companyEntities) {
        		companyDetailsDTO = companyModelMapper.toCompanyDTO(companyEntity);
        		companyDetailsDTOs.add(companyDetailsDTO);
        	}	
        }
        return companyDetailsDTOs;
	}

	@Override
	public List<CompanyDetailsDTO> findCompanyByStockExchangeId(Integer stockexchangeId) throws Exception {
		
		return null;
	}

	@Override
	public CompanyDetailsDTO addNewCompany(CompanyDetailsDTO companyDetailsDTO) throws Exception {
		CompanyEntity companyEntity = companyModelMapper.toCompanyEntity(companyDetailsDTO);
		companyDetailsRepsitory.save(companyEntity);
		return companyDetailsDTO;
	}

}
