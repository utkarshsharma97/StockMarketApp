package io.javafullstack.stockmarketapp.companydetailsservice.dto;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import io.javafullstack.stockmarketapp.companydetailsservice.dao.entities.CompanyIPOEntity;

@Component
public class CompanyIPOModelMapper {
	public CompanyIPODetailsDTO toCompanyIPODTO(CompanyIPOEntity companyIPOEntity) {
		 ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 CompanyIPODetailsDTO companyIPODetailsDTO = mapper.map(companyIPOEntity, CompanyIPODetailsDTO.class);
		 return companyIPODetailsDTO;
	 }
}
