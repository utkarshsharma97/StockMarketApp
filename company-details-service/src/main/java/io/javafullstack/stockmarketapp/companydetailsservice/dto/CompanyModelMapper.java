package io.javafullstack.stockmarketapp.companydetailsservice.dto;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.javafullstack.stockmarketapp.companydetailsservice.dao.entities.CompanyEntity;

@Component
public class CompanyModelMapper {
	public CompanyDetailsDTO toCompanyDTO(CompanyEntity companyEntity) {
		 ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 CompanyDetailsDTO companyDetailsDTO = mapper.map(companyEntity, CompanyDetailsDTO.class);
		 return companyDetailsDTO;
	 }
	 public CompanyEntity toCompanyEntity(CompanyDetailsDTO companyDetailsDTO) {
		 ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 CompanyEntity companyEntity = mapper.map(companyDetailsDTO, CompanyEntity.class);
		 return companyEntity;
	 }
}
